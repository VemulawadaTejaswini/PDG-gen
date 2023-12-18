
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
String s=sc.next();
String  t=sc.next();
int n=s.length();
int m=t.length();
int count=0;
int ans=Integer.MAX_VALUE;
	for(int i=0;i<n-m+1;i++) {
		String ss=s.substring(i,i+m);
		for(int j=0;j<ss.length();j++) {
			if(ss.charAt(j)!=t.charAt(j)) {
				count++;
			}
		}

		ans=Math.min(ans,count);
		count=0;
	}
	System.out.println(ans);

	}
}