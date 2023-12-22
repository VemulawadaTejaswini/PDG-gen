




import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if (b>a+2 && k>=a+1) {
			System.out.println(a+((k-a+1)/2)*(b-a)+(k-a+1)%2);
		} else {
			System.out.println(k+1);
		}
	}



}
