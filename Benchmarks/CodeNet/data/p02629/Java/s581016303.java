import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		//
		StringBuilder a=new StringBuilder("");
		long count=0;
		long p=n%26;
		while(n>26) {
			long q=n%26;
			
			n/=26;
			
			count++;
			//System.out.println(q);
			if(q==0) {
				a.append((char)('a'+q));
			}else {
				a.append((char)('a'+q-1));
			}
		}
		//System.out.println(count+" "+n);
		if(n==0) {
			a.append((char)('a'+n));
		}else {
			a.append((char)('a'+n-1));
		}
		
		System.out.println(a.reverse());
	}
}
