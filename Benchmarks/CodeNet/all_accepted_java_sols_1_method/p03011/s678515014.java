import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int P = stdIn.nextInt();
		int Q = stdIn.nextInt();
		int R = stdIn.nextInt();
		
		if(P <= Q) {
			if(R <= Q) {
				System.out.println(P+R);
			}
			else {
				System.out.println(P+Q);
			}
			
		}
		else {
			if(R <= P) {
				System.out.println(R+Q);
			}
			else {
				System.out.println(P+Q);
			}
		}

	}

}