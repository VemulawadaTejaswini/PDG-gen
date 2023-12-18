import java.util.*;
import java.lang.*;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) a[i]=sc.nextLong();
		Set<Long> s=new HashSet<>();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				s.add(a[i]*a[j]);
			}
		}
		long total=0;
		for(Long e: s) total+=e;
		System.out.println(total%((long)Math.pow(10, 9)+7));

	}

}
