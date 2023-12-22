import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long m = scan.nextLong();

		if(m < 2){
			System.out.println(0);
		}
		else if(n >= m/2){
			System.out.println(m/2);
		}
		else{
			if(n != 0){
				m -= n*2;
			}
			System.out.println(n+(m/4));
		}
	}
}
