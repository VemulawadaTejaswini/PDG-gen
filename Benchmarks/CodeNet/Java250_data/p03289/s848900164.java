
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//int R = in.nextInt();
		char[] S = in.nextLine().toCharArray();
		
		if(S[0] != 'A') {
			System.out.print("WA");
			System.exit(0);
		}
		
		if((int)S[1] < (int)'a') {
			System.out.print("WA");
			System.exit(0);
		}
		int count = 0;
		for(int i=2; i<S.length-1; i++) {
			if(S[i] == 'C') {
				count++;
				if(count == 2) {
					System.out.print("WA");
					System.exit(0);
				}
			}
		}
		if(count != 1) {
			System.out.print("WA");
			System.exit(0);
		}
		if((int)S[S.length-1] < (int)'a') {
			System.out.print("WA");
			System.exit(0);
		}
		System.out.print("AC");
		in.close();
	}
}