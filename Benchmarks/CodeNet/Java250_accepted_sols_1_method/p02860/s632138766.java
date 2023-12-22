import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int[] alb = new int[26];
		boolean t = true;
		for(int i = 0 ; i<s.length(); i++) {
			
			alb[s.charAt(i)-'a']++;
		}
		for(int i = 0 ; i<26; i++) {
			if(alb[i]%2!=0) {
				
				t = false;
				break;
			}
		}
	//	System.out.println(Arrays.toString(alb));
		if(t)System.out.println("Yes");
		else System.out.println("No");
	}
}
