import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,s,e;
		String word;
		int[] start;
		int[] end;
		int[] ring;
		
		for(;;) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}
			
			start = new int[26];
			end = new int[26];
			ring = new int[26];
			
			for(int i=0; i<n; i++) {
				word = sc.next();
				s = word.charAt(0) - 97;
				e = word.charAt(word.length()-1) - 97;
				start[s] ++;
				end[e] ++;
				if(s == e) {
					ring[s] ++;
				}
			}
			
			for(int i=0; i<26; i++) {
				if(start[i] == end[i]) {
					if(start[i] < ring[i]) {
						System.out.println("NG");
						break;
					}
				} else {
					System.out.println("NG");
					break;
				}
				
				if(i == 25) {
					System.out.println("OK");
				}
			}
			
		}
	}
}