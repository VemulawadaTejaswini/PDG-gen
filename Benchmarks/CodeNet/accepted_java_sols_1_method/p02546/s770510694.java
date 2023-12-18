import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();

		if(S.charAt(S.length() - 1) == 's'){
			System.out.println(S + "es");
		}
		else{
			System.out.println(S + "s");
		}
		stdIn.close();
	}
}