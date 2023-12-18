import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		
		
		
		long near = (int) (x/d);
		long stop = k - near;
		
		/*
		System.out.println(near);
		System.out.println(stop);  
		 */
		
		if(k < near) {
			x -= k * d;
			System.out.print(Math.abs(x));
			return;
		}
		
		if( stop % 2 == 0) {
			x -= near * d;
			System.out.print(Math.abs(x));
			return;
		}
		else {
			x -= near * d;
			
			if(Math.abs(x+d) < Math.abs(x-d)) {
				System.out.print(Math.abs(x+d) );
				return;
			}
			else if(Math.abs(x+d) > Math.abs(x-d)) {
				System.out.print(Math.abs(x-d));
				return;
			}
			else {
				
				System.out.print(Math.abs(x+d) );
				return;
			}
		}
	}

}
