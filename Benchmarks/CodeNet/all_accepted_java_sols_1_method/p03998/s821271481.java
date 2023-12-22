import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String SA = keyboard.nextLine();	
		String SB = keyboard.nextLine();	
		String SC = keyboard.nextLine();	
		
		String input = SA.substring(0,1);
		int Along = SA.length();
		int Blong = SB.length();
		int Clong = SC.length();
		String ans = "X";
		
		while(ans.equals("X")) {
			if(input.equals("a")) {
				if(Along != 0) {
					input = SA.substring(0,1);
					SA = SA.substring(1, Along);
					Along--;
					continue;
				}else {
					ans = "A";
				}
			}else if(input.equals("b")) {
				if(Blong != 0) {
					input = SB.substring(0,1);
					SB = SB.substring(1, Blong);
					Blong--;
					continue;
				}else {
					ans = "B";
				}
			}else{ 	//(input.equals("c")) 
				if(Clong != 0) {
					input = SC.substring(0,1);
					SC = SC.substring(1, Clong);
					Clong--;
					continue;
				}else {
					ans = "C";
				}
			}
		}
		
		System.out.print(ans);
		keyboard.close();	
	}
}
