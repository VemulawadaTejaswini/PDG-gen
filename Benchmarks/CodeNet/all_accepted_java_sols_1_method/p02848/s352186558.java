import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String A = sc.next();
		char c = ' ';

		for(int i=0;i<A.length();i++) {
			c = A.charAt(i);
			for(int k=0;k<N;k++) {
				if(c=='Z'){
					c='A';
					--c;
				}
				++c;
			}

			System.out.print(c);
		}


	}

}
