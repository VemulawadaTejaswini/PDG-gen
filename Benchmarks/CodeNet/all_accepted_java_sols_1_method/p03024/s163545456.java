import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		String[] hosi = S.split("");
		
		int count = 0;
		
		for(int i = 0; i < S.length(); i++) {
			if(hosi[i].equals("x")) {
				count++;
			}
		}
		
		String ans;
		if(count >= 8) {
			ans = "NO";
		}else {
			ans = "YES";
		}
		System.out.println(ans);
		keyboard.close();	
	}
}