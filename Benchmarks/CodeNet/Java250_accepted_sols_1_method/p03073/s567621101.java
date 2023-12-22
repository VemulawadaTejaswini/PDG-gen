import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S = keyboard.next();
		
		String[] tile = S.split("");
		
		String Start = tile[0];
		int countG = 0;
		int countK = 0;
		
			for (int g = 0; g < tile.length; g = g+2) {
				 if (tile[g].equals(Start)) {
					 countK ++;
				 }else {
					 countG ++;
				 }
				 	if (g != tile.length - 1) {
				 		int k = g + 1;
				 if (tile[k].equals(Start)) {
					 countG ++;
				 	}else{
					 countK ++;
				 		}
				 	}
			}
			
			int kotae = 0;
			
			kotae = countG < countK ? countG : countK;
		
		System.out.println(kotae);
		keyboard.close();
	}
}