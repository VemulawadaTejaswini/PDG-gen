import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		String S = sc.next();

		String[] str = new String[N];

		for(int i=0; i<N; i++) {

			if(i==K-1) {
				if( String.valueOf(S.charAt(i)) .equals( "A")) str[i] = "a";
				else if( String.valueOf(S.charAt(i)).equals( "B"))  str[i] =  "b";
				else if( String.valueOf(S.charAt(i)) .equals( "C"))  str[i] =  "c";
			}
			else {
			str[i] = String.valueOf(S.charAt(i));

			}

		}
		for(int i=0; i<N; i++) {


		System.out.print(str[i]);
		}
	}

}
