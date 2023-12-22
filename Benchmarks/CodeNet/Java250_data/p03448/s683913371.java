import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int X = stdIn.nextInt();
		int count = 0;
		for(int i = 0; i <= A && i <= X/500; i++) {
			for(int j = 0; j <= B && j <= (X-500*i)/100; j++) {
				if((X-500*i-100*j)%50 == 0 && (X-500*i-100*j)/50 <= C) count++;
			}
		}
		System.out.println(count);

	}

}