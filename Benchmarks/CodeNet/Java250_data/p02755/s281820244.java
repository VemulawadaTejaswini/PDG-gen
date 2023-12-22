

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		int anser = -1;

		for(int i = 13;i<1010;i++) {
			if((int)(i*0.08) == A && (int)(i*0.1) == B) {
				anser = i;
				break;
			}
		}

		System.out.println(anser);
	}

}
