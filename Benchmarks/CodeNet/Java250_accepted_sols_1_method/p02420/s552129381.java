import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String S = sc.next();
			if(S.equals("-")) break;
			int m = sc.nextInt();
			
			for(int i = 0; i < m; i++){
				int h = sc.nextInt();
				String right = S.substring(h);
				String left = S.substring(0, h);
				S = right + left;
			}
			
			System.out.println(S);
		}
	}
}
