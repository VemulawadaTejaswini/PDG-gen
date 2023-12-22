import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String W = sc.next();
		int count = 0;
		
		while(true){
			String T = sc.next();
			if(T.equals("END_OF_TEXT")) break;
			if(T.length() != W.length()) continue;
			boolean tf = true;
			for(int i = 0; i < T.length(); i++){
				if(T.charAt(i) != W.charAt(i) && (T.charAt(i) - 'a' + 'A') != W.charAt(i) && T.charAt(i) != (W.charAt(i) - 'a' + 'A')){
					tf = false;
					break;
				}
			}
			if(tf){
				count++;
			}
			//System.out.println(T);
		}
		System.out.println(count);
	}
}
