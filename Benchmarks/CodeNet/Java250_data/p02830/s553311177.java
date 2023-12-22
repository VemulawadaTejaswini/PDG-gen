import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
	public static boolean hantei(String str) {
        return Pattern.matches("^[a-z]+$", str);
    }
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S;
		String T;
		int N = 0;
		do {
			N = stdIn.nextInt();
			S = stdIn.next();
			T = stdIn.next();
		}while(hantei(S)==false||hantei(T)==false||N<1||N>100);
		String[] aS = S.split("");
		 
		  String[] aT = T.split("");
		 
		for(int i=0; i<N ; i++) {
				System.out.print(aS[i]+""+aT[i]);
			}
	}
}
