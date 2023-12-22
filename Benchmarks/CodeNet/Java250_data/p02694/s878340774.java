
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		long X = cin.nextLong();
		long deposit = 100,count = 0;
		
		while(deposit<X) {
			deposit += deposit/100;
			count++;
		}
		
		System.out.println(count);
		return;
		
		
	}

}