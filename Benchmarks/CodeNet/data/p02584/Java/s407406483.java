import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		scan.close();


		for(int i=0;i<k;i++) {
			if(Math.abs(x-d)>=Math.abs(x+d)) {
				x+=d;
			}else {
				x-=d;
			}
		}
		System.out.println(Math.abs(x));

	}

}