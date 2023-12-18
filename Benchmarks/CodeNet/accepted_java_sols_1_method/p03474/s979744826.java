import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		boolean ans = true;
		
		for(int i = 0; i < S.length(); i++){
			char c = S.charAt(i);
			if(i == A && c != '-') ans = false;
			else if(i != A && c < '0' || c > '9') ans = false;
		}
		
		System.out.println(ans?"Yes":"No");
	}
}