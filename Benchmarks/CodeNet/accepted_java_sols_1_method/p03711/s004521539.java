import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String result = "No";
		
		String [] group = {" 1 3 5 7 8 10 12 ", " 4 6 9 11 ", " 2 "};
		
		String x = sc.next();
		String y = sc.next();
		
		for (int i = 0; i < group.length; i++) {
		    if(group[i].contains(" " + x + " ") && group[i].contains(" " + y + " ")) {
		        result = "Yes";
		    }
		}
		
		// output
		System.out.println(result);
	}
}