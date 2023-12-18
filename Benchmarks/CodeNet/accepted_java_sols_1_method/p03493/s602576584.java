import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int ans = 0;
		for(int i = 0; i < 3; i++) ans += S.charAt(i) - '0';
		System.out.println(ans);
	}
}