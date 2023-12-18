import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		
		int ans = 0;
		for(int i = 0; i < s.length();i++) {
			int cnt = 0;
			
			if(s.charAt(i)== 'A' ||s.charAt(i)== 'C' ||s.charAt(i)== 'G' || s.charAt(i)=='T') {
				cnt++;
				for(int j = i+1 ;j < s.length();j++) {
					if(s.charAt(j)== 'A' ||s.charAt(j)== 'C' ||s.charAt(j)== 'G' || s.charAt(j)=='T') {
						cnt++;
					}else {
						//ans = Math.max(ans, cnt);
						break ;
					}
				}
			}
			
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
		
		
		
	}

}
