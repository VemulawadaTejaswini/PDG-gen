import java.util.*;

public class Main {
	public static int getMax(int x, int y) {
		if(x > y) {
			return x;
		}
		else if(x < y) {
			return y;
		}
		return x;
	}
	
	public static int getLength(String x, String y) {
		String[] xStr = x.split("");
		String[] yStr = y.split("");
		int[][] arr = new int[xStr.length][yStr.length];
		for(int i = 0; i < xStr.length; i++) {
			for(int j = 0; j < yStr.length; j++) {
				if(i == 0) {
					if(j == 0) {
						if(!(xStr[i].equals(yStr[j]))) arr[i][j] = 0;
						else arr[i][j] = 1;
					}
					else {
						if(!(xStr[i].equals(yStr[j]))) arr[i][j] = arr[i][j - 1];
						else arr[i][j] = 1;
					}
				}
				else {
					if(j == 0) {
						if(!(xStr[i].equals(yStr[j]))) arr[i][j] = arr[i - 1][j];
						else arr[i][j] = 1;
					}
					else {
					if(!(xStr[i].equals(yStr[j]))) arr[i][j] = getMax(arr[i][j - 1], arr[i - 1][j]);
					else arr[i][j] = arr[i - 1][j - 1] + 1;
					}
				}
			}
		}
		return arr[xStr.length - 1][yStr.length - 1];
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		for(int i = 0; i < total; i++) {
			System.out.println(getLength(in.next(), in.next()));
		}
	}
}

