import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int firstIndex = S.length();
		int lastIndex = S.length();
		char[] sArray = S.toCharArray();
		for (int i = 0; i < sArray.length; i++) {
			if (firstIndex == S.length() && sArray[i] == 'A')
				firstIndex = i;
			if (sArray[i] == 'Z')
				lastIndex = i;
		}
		System.out.println(S.substring(firstIndex, lastIndex + 1).length());
		sc.close();
	}
}