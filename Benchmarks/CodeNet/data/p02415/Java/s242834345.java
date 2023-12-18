import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		char[] B = A.toCharArray();
		
		
		for(int i = 0; i < B.length; i++) {
			if(Character.isLowerCase(B[i])) {
				B[i] = Character.toUpperCase(B[i]);
			}
			else if (Character.isUpperCase(B[i])) {
				B[i] = Character.toLowerCase(B[i]);
			}
		}
		
		A = new String(B);
		
		System.out.println(A);
	}
}
