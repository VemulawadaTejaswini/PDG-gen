import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a0 = sc.nextInt();
			int L = sc.nextInt();
			if(a0 == 0 && L == 0) break;
			
			String[] num = new String[20];/* 繰り返しは20以下のみ(ケースの条件) */
			num[0] = make6Digit(Integer.toString(a0), L);/* a0の保存 */

			//System.out.println("a0=" + num[0]);
			for(int i = 1; i < num.length; i++) {
				String max = makeMax(num[i-1], L);
				String min = makeReverse(max);
				num[i] = make6Digit(Integer.toString(
						Integer.parseInt(max) - Integer.parseInt(min)
						), L);
				//System.out.println("a" + i + ":" + max + "-" +  min + "=" + num[i]);
				
				boolean _break = false;
				for(int j = 0; j < i; j++){
					if(num[i].equals(num[j])) {
						System.out.println(j + " " + Integer.parseInt(num[i]) + " " + (i - j));
						_break = true;
						break;
					}
				}
				if(_break) break;
			}
		}
	}
	
	public static String makeMax(String num, int l) {
		num = make6Digit(num, l);/* 6桁にする */

		/* 降順ソート */
		Integer[] array = new Integer[num.length()];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(num.charAt(i) + "");
		}
		Arrays.sort(array, Comparator.reverseOrder());

		/* 連結 */
		String max = new String();
		for(int i = 0; i < array.length; i++)
			max += Integer.toString(array[i]);
		return max;
	}

	public static String makeReverse(String num) {
		return new String(new StringBuilder(num).reverse());
	}
	
	public static String make6Digit(String num, int l) {
		int add_0 = l - num.length();
		for(int i = 0; i < add_0; i++) {
			num = "0" + num;
		}
		return num;
	}
}

