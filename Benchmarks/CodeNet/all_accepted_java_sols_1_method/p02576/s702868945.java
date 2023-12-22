
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int X =sc.nextInt();
		int T =sc.nextInt();

		if(N/X == 0) {
			System.out.println(T);
		}
		else {
			int i = N/X;
			if(N%X==0) {
				System.out.println(T*i);
			}
			else {
				System.out.println(T*i + T);
			}
		}
	}
}
