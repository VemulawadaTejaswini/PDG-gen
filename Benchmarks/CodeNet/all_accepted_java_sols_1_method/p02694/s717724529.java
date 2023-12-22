import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long m = 100;
		long X = scan.nextLong();
		int y = 0;
		scan.close();
		do {
			m = (long) (m+(m*0.01));
			y++;
		}while(m<X);
		
		System.out.println(y);

	}
}