import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        String S = sc.next(); 
        
        int ans = 753;
        
		for (int i = 0; i < S.length() - 2; i++) {
			
			String XString = S.substring(i,i + 3);
			int X = Integer.parseInt(XString);
			
			if (Math.abs(X - 753) < ans) {
				ans = Math.abs(X - 753);
			}
		}
		
		System.out.println(ans);
	}
}