import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    String[] Dates = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	    
	    for (int i = 0; i < Dates.length; i++) {
	    	if (S.equals(Dates[i])) {
	    		System.out.println(7 - i);
	    	}
	    }
	}	
}	