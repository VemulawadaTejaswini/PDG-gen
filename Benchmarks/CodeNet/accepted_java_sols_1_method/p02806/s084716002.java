import java.util.*;

public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[]a=new String[n];
		int[]b=new int[n+1];
		for(int i=0;i<n;++i) {
			a[i]=s.next();
			b[i+1]=b[i]+s.nextInt();
		}
		String t=s.next();
		for(int i=0;i<n;++i)
			if(t.equals(a[i]))
				System.out.println(b[n]-b[i+1]);
	}
}