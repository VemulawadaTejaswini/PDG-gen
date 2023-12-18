import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		char[] s = stdIn.next().toCharArray();
		int cnt = 0;
		for(int i = 0; i < s.length-2; i++) {
			if(s[i]=='A' && s[i+1]=='B' && s[i+2]=='C') {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		
		
		
	}

}
