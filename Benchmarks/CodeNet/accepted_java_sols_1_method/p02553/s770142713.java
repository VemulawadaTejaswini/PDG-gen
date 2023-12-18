import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		long ans=Math.max(a*c,Math.max(a*d,Math.max(b*d,b*c)));
		System.out.println(ans);

	}
}