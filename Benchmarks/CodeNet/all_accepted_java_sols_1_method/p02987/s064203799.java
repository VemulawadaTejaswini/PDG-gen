import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] sArray = S.toCharArray();
		Arrays.sort(sArray);
		String result = "No";
		if (sArray[0] == sArray[1] && sArray[0] != sArray[2] && sArray[2] == sArray[3]) {
			result = "Yes";
		}
		System.out.println(result);
		sc.close();
	}
}