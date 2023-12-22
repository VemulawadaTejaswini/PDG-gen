import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String w = in.next();
		int c=0;
		;int con=0;
		for (int i = 0; i < w.length(); i++) {
			for (int j = 0; j < w.length(); j++) {
				if(w.charAt(i)==w.charAt(j)) {
					c++;
				}
			}
			if(c%2!=0) {
				System.out.println("No");
				con++;
				break;
			}
			
		}
		if(con==0) {
			System.out.println("Yes");
		}
	}
}