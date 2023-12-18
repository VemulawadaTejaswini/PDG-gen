import java.util.Scanner;

public class Main {

	public static void main(String[] aggs){

	Scanner stdIn = new Scanner(System.in);
	int D = stdIn.nextInt();
	int T = stdIn.nextInt();
	int S = stdIn.nextInt();

	if(D<=T*S) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}

	}
}
