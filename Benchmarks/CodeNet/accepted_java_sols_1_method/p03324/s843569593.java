import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long d = in.nextInt();
		long n = in.nextInt();
		if(d==0) {
			long num = n/100;
			System.out.println(n+num);
		}else if(d==1) {
			long num = n/100;
			System.out.println((n+num)*100);
		}else {
			long num = n/100;
			System.out.println((n+num)*10000);
		}

	}

}