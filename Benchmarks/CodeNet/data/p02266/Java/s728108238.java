import java.util.ArrayList;
//import java.util.Random;
import java.util.Scanner;


public class Main {
	static Slope[] data;
	static int[] height;
	static boolean[] mount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

//		StringBuffer str2 = new StringBuffer();
//		int n = (int)(Math.random() * 200) + 1;
//		for (int i = 0; i < n; i++) {
//			int mod = (int)(Math.random() * 1000);
//			switch (mod % 3) {
//			case 0:
//				str2.append('/');
//				break;
//			case 1:
//				str2.append('\\');
//				break;
//			case 2:
//				str2.append('_');
//				break;
//			default:
//				assert true;
//			}
//		}
//		String input = str2.toString();
//		System.out.println(input);
		
		data = new Slope[input.length()];
		
		for (int i = 0; i < data.length; i++) {
			char temp = input.charAt(i);
			switch (temp) {
				case '\\':
					data[i] = Slope.DOWN;
					break;
				case '/':
					data[i] = Slope.UP;
					break;
				case '_':
					data[i] = Slope.FLAT;
					break;
				default:
					assert true;
			}
		}

		height = new int[data.length + 1];
		height[0] = 0;
		mount = new boolean [data.length + 1];
		Slope prev = Slope.UP;
		for (int i = 0; i < data.length; i++) {
			height[i + 1] = height[i] + data[i].height;
			if (prev == Slope.UP && data[i] == Slope.DOWN) {
				mount[i] = true;
			}
			if (data[i] != Slope.FLAT) {
				prev = data[i];
			}
		}
		if ( prev == Slope.UP) {
			mount[data.length] = true;
		}

//		for (int i = 0; i < height.length; i++) {
//			System.out.println(height[i] + ":" + mount[i]);
//		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < height.length; ) {
			int from = nextMount(i);
			if (from == -1) {
				break;
			}
			i = from;
			int to = highestMount(from + 1);
			if (to == -1) {
				i++;
				continue;
			}
			result.add(getSquare(from, to));
			i = to;
		}

		int sum = 0;
		StringBuffer str = new StringBuffer();
		str.append(result.size());
		for (int i = 0; i < result.size(); i++) {
			sum += result.get(i);
			str.append(" ");
			str.append(result.get(i));
		}
		System.out.println(sum);
		System.out.println(str);
		
		sc.close();
	}
	
	private static int nextMount(int start) {
		for (int i = start; i < mount.length; i++) {
			if (mount[i] == true) {
				return i;
			}
		}
		
		return -1;
	}
	
	private static int highestMount(int start) {
		int maxHeight = Integer.MIN_VALUE;
		int maxIndex = -1;
		for (int i = start; i < mount.length; i++) {
			if (mount[i] == true && maxHeight < height[i]) {
				maxIndex = i;
				maxHeight = height[i];
			}
		}
		
		return maxIndex;
	}
	
	private static int getSquare(int from, int to) {
		int min = Math.min(height[from], height[to]);
		int square = 0;
		for (int i = from; i < to; i++) {
			if (height[i] > min || height[i + 1] > min) {
				continue;
			}
			square += (min - height[i] + min - height[i + 1]);
		}
		return square / 2;
	}
	
	private static enum Slope {
		DOWN(-1), UP(1), FLAT(0);
		
		int height;
		Slope(int height) {
			this.height = height;
		}
	}
}