import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		String answer = "";
		if(A.equals(B)){
			answer = C;
		}else if(B.equals(C)){
			answer = A;
		}else{
			answer = B;
		}
		System.out.println(answer);


	}
}