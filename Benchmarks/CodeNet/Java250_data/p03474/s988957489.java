import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		boolean result = true;

		for (int i=0; i < S.length(); i++){
			char c = S.charAt(i);
			if (i+1 <= A || i+1 >= A+2){
				if (c < '0' || c > '9'){
					result = false;
					break;
				}
			} else {
				if (c != '-'){
					result = false;
					break;
				}
			}
		}
		if (result){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
