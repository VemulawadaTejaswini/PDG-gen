import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		
		x = Math.abs(x);
		
		long near = (int) (x/d);
		long stop = k - near;
		if(stop < 0) {
			stop = 0;
		}
		/*
		System.out.println(near);
		System.out.println(stop);  
		*/
		
		if(Math.abs(x-near*d) > Math.abs(x-(near+1)*d)) {
			System.out.print(Math.abs(x-(near+1)*d));
			return;
		}
		else if(Math.abs(x-near*d) < Math.abs(x-(near+1)*d)) {
			System.out.print(Math.abs(x-(near*d)));
			return;
		}
		
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
