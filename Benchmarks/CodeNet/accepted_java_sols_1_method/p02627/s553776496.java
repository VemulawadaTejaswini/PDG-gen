

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String x=scan.next();
		char[] y=x.toCharArray();
		if(y[0]>='A' && y[0]<='Z') {
			System.out.println("A");
		}
		else {
			System.out.println("a");
		}
	}

}
