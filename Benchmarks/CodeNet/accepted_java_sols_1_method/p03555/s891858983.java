import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		String a = sc.next();
		String b = sc.next();
		String answer = "YES";

		for(int i = 0; i < 3; i++){
			if(a.charAt(i) != b.charAt(2-i)){
				answer = "NO";
				break;
			}
		}
		System.out.println(answer);
	}
}