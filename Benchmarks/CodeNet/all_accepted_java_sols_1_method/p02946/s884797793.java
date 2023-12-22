import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();
		for(int i = X - K + 1; i < X + K; i++){
			System.out.println(i);
		}
		stdIn.close();
	}
}
