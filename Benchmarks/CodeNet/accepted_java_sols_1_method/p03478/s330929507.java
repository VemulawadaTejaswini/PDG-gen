import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
		};
		int[] SUM = new int[array[0]];
		int sumsum = 0;
		for(int i=1; i<=array[0]; i++){
			String s = String.valueOf(i);
			char[] c = s.toCharArray();
			int ss = 0;
			for(int j=0; j<c.length; j++){
				ss += Character.getNumericValue(c[j]);
			};
			if (array[1] <= ss && ss <= array[2]) {
				sumsum += i;
			}
		};
		System.out.println(sumsum);
	}
}
