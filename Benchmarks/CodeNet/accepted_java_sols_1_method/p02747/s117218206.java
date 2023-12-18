import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] s = stdIn.next().split("");
		
		int cnt = 0;
		
		for(int i = 0; i < s.length-1; i++) {
			
			if(s[i].equals("h")&& s[i+1].equals("i")) {
				i++;
			}else {
				System.out.println("No");
				return;
			}
			
			
		}
		
		int cnth = 0;
		int cnti = 0;
		int els = 0;
		
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("h")) {
				cnth++;
			}
			else if(s[i].equals("i")) {
				cnti++;
			}else {
				els++;
			}
		}
		
		if(cnth == cnti && els == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
