import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String s = sc.next();
			String ans = s.substring(0,1);
			
			int now = 0;
			
			for(int j=1;j<s.length();j++){
				if(s.codePointAt(j)==60) now--;
				else if(s.codePointAt(j+1)==62) now++;
				if(now==-1){
					ans = (char)s.codePointAt(j+2) + ans;
					now++;
				}
				else if(now==ans.length()) ans = ans + (char)s.codePointAt(j+2);
				j += 2;
			}
			System.out.println(ans);
		}
	}	
}