import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] x = new int[4];
		char[] y = new char[3];

		x[0] = Integer.parseInt(s.substring(0,1));
		x[1] = Integer.parseInt(s.substring(1,2));
		x[2] = Integer.parseInt(s.substring(2,3));
		x[3] = Integer.parseInt(s.substring(3,4));


		for(int i = 0 ; i < 8 ; i++) {
			int sum = x[0];    
			for(int j = 0 ; j < 3 ; j++) {
				if((1 & (i>>j)) == 1) {
					sum += x[3-j];
					y[2-j] = '+';

				} else {
					sum -= x[3-j];
					y[2-j] = '-';
				}
			}
			if(sum == 7) {
				System.out.print(x[0]);
				System.out.print(y[0]);
				System.out.print(x[1]);
				System.out.print(y[1]);
				System.out.print(x[2]);
				System.out.print(y[2]);
				System.out.print(x[3]);
				System.out.print("=7");
				return;
			}
		}
	}
}
