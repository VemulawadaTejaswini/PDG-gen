import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S = keyboard.next();	
		String T = keyboard.next();	
			
		String[] strArrayS = S.split("");
		String[] strArrayT = T.split("");
		
		int Slong = S.length();
		
		int count = 0;
		for (int i=0; i<Slong; i++) {
			if(!strArrayS[i].contentEquals(strArrayT[i])) {

				count++;
			}
		}
					
							
		System.out.println(count);
		keyboard.close();	
	}
}
