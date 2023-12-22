import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		if(N - M > 0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		stdIn.close();
	}
}