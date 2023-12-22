import java.util.*;
import java.lang.Math.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int hund=n/500;
		n=n%500;
		int t=n/5;
		int ans=hund*1000+t*5;
		System.out.println(ans);
	}
}