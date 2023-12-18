import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();
		boolean[] win = new boolean[n];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			//System.out.println(t.charAt(i));
			if(i<k) {
				if(t.charAt(i) == 'r') {
					win[i] = true;
					ans+=p;
				}
				else if(t.charAt(i) == 's') {
					win[i] = true;
					ans+=r;
				}
				else if(t.charAt(i) == 'p') {
					win[i] = true;
					ans+=s;
				}
			}
			else {
				if((t.charAt(i)=='r'&&t.charAt(i-k)!='r')||(t.charAt(i)=='r'&&t.charAt(i-k)=='r'&&win[i-k]!=true)) {
					win[i] = true;
					ans+=p;
				}
				else if((t.charAt(i)=='s'&&t.charAt(i-k)!='s')||(t.charAt(i)=='s'&&t.charAt(i-k)=='s'&&win[i-k]!=true)) {
					win[i] = true;
					ans+=r;
				}
				else if((t.charAt(i)=='p'&&t.charAt(i-k)!='p')||(t.charAt(i)=='p'&&t.charAt(i-k)=='p'&&win[i-k]!=true)) {
					win[i] = true;
					ans+=s;
				}
			}
		}
		System.out.println(ans);
	 }
}