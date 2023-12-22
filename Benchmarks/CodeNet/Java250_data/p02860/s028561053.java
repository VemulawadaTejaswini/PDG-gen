import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String S = stdIn.next();
		if(S.substring(0,N/2).equals(S.substring(N/2,N))){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

		stdIn.close();
	}
}
