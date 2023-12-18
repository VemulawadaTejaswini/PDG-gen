import java.util.*;
import java.awt.geom.*;

public class Main{
	String [][] table = {
			{"wa", "", "nn", "", "wo"},
			{"a", "i", "u", "e", "o"},
			{"ka", "ki", "ku", "ke", "ko"},
			{"sa", "si", "su", "se", "so"},
			{"ta", "ti", "tu", "te", "to"},
			{"na", "ni", "nu", "ne", "no"},
			{"ha", "hi", "hu", "he", "ho"},
			{"ma", "mi", "mu", "me", "mo"},
			{"ya", "", "yu", "", "yo"},
			{"ra", "ri", "ru", "re", "ro"},
			
	};
	String order = "TLURD";

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			for(int i = 0; i < s.length(); i += 2){
				char c1 = s.charAt(i);
				char c2 = s.charAt(i + 1);
				int num1 = c1 - '0';
				int num2 = order.indexOf(c2 + "");
				System.out.print(table[num1][num2]);
			}
			System.out.println();
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}