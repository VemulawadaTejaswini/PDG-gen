import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;

		sc = new Scanner(in);

		String N = sc.next();
		int answer = 0;

		for(int i = 0; i < 3; i++){
			if(N.charAt(i) == '1'){
				answer++;
			}
		}
		System.out.println(answer);
	}
}