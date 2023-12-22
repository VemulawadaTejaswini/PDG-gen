import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String T = stdIn.next();
		int c=0;
		for(int a=0; a<S.length(); a++){
			if(S.charAt(a) != T.charAt(a)){
				c++;
			}
		}
		System.out.println(c);
		stdIn.close();
	}
}
