import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		String decode = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') {
				decode+="X";
			} else if(str.charAt(i) == 'B') {
				decode+="Y";
			} else if(str.charAt(i) == 'C') {
				decode+="Z";
			} else {
				decode+=String.valueOf((char)(str.charAt(i) - 3));	
			}
		}
		
		System.out.println(decode);
	}
}