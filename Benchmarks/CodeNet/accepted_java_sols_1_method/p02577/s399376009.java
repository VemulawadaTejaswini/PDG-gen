import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int ans = 0;
		for(int i = 0;i < n.length(); ++i){
			int x = n.charAt(i)-'0';
			ans += x;
			ans %= 9;
		}
		System.out.print(ans==0?"Yes":"No");

	}
}
