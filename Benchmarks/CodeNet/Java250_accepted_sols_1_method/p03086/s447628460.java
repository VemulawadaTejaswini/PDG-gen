import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		String s=scn.next();
		int ans=0;
		int nans=0;
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)=='A' || s.charAt(i)=='G' || s.charAt(i)=='C' || s.charAt(i)=='T') {
				nans++;
				i++;
			}else {
				ans=Math.max(nans, ans);
				nans=0;
				i++;
			}
		}ans=Math.max(nans, ans);
		System.out.println(ans);
    }
}