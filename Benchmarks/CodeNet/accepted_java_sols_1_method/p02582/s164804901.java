import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String k = s.next();
		int max = 0;
		for(int i=0;i<k.length();i++) {
			int ctr = 0;
			while(i<k.length() && k.charAt(i)=='R') {
				i++;
				ctr++;
			}
			max = Math.max(max,ctr);
			
		}
		System.out.println(max);
		
		
	}
}
