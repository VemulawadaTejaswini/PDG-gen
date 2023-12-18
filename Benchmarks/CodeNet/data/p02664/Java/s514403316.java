import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String[] s1 = s.split("");
		String[] s2 = new String[s1.length];
		int ans = 0;
		
		for(int i = 0; i < s1.length; i++) {
			
			/*if(s1[i].equals("?")) {
				if(i == s1.length -1) {
					s1[i] = "D";
				}
				
				if(s1[i+1].equals("D") && i < s1.length -2) {
					s1[i] = "P";
				}
				if(s1[i-1].equals("P") && i > 1) {
					s1[i] = "D";
				}
				
				
			}*/
			if(s1[i].equals("?")) {
				s2[i] = "D";
				
			}
			else {
				s2[i] = s1[i];
				
			}
			
		}
		
		for(int i = 0; i < s1.length; i++) {
			
			if(s1[i].equals("D")) {
				ans++;
			}
			if(i < s1.length - 1) {
			if(s1[i].equals("P") && s1[i+1].equals("D")) {
				ans++;
			}
			}
		}
		String answer = String.join("", s2);
		
		System.out.println(answer);
		
	}

}