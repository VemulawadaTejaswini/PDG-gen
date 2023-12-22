import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		
		if(S.indexOf('A') == 0) {
			count++;
		}	
		
		if(S.replace("C", "").length() == (S.length() - 1)) {
			if((S.indexOf('C') >= 2) && (S.length() - S.indexOf('C') >= 2)) {
				count++;
			}
		}
		
		String SnA = S.replace("A", "");
		String SnAC = SnA.replaceAll("C", "");
		
		if(SnAC.toLowerCase() == SnAC) {
			count++;
		}
		
		if(count == 3) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
		
	}
}
