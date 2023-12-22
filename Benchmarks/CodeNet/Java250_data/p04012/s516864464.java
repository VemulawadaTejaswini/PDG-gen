import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		String str = cin.nextLine();
		
		/*start*/
		
		int[] count = new int[26];
		
		for (int i = 0; i < str.length(); i ++) {
			
			count[str.charAt(i) - 'a'] ++;
		}
		
		String res = "Yes";
		
		for (int c: count) {
			
			if (c % 2 != 0) {
				res = "No";
				break;
			}
		}
		
		/*finish*/
		System.out.println(res);
	}
}

