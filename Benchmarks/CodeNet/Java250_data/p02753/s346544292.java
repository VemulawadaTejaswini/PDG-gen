import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		
		String ans = "No";
		int a = 0;
		int b = 0;
		
		for(int i=0;i<3; i++) {
			if(S.charAt(i) == 'A') {
				a++;
			}else {
				b++;
			}
		}
		
		if(a != 0 && b != 0 ) {
			ans = "Yes";
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
