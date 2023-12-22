import java.util.*;
import java.lang.Math.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		n=n%k;
		Long min=Math.min(n, Math.abs(n-k));
		System.out.println(min);
	}
}