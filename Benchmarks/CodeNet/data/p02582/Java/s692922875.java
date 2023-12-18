import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 0;
		int ans = 0;
		for(int i = 0;i < s.length(); ++i){
			if(s.charAt(i) == 'R')count++;
			else{
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		ans = Math.max(ans,count);
		System.out.print(ans);
	}
}
