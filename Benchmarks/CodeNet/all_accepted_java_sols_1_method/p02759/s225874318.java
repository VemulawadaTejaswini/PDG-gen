

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n>=1 && n<=100) {
		if(n%2 == 0) {
			System.out.println(n/2);
		}else {
			System.out.println(n/2 +1);
		}
		}

	}

}
