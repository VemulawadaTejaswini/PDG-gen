
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			CHECK_NUM(i);
			if(i/10==1)INCLUDE3(i);
		}
		System.out.println();
		scan.close();
	}

	static void CHECK_NUM(int n) {
		if(n%3 == 0) System.out.print(" "+n);
	}
	
	static void INCLUDE3(int n) {
		if(n%10 == 0) System.out.print(" "+n);
	}
}
