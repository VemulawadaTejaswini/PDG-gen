import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		for(int i=1; i<=s.length()/2; i++) {
			int subslength = (s.length()-2*i)/2;
			
			if(s.substring(0, subslength-1).equals(s.substring(subslength, s.length()-2*i-1))) {
				System.out.println(s.length()-2*i);
				break;
			
			}
		}
	}
}
