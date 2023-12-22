import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n];
		
		int max=0;
		long total=0;
		for(int i=0;i<n;++i) {
			p[i]=sc.nextInt();
			max=Math.max(p[i], max);
			total=total+p[i];
		}
		total=total-max/2;
		System.out.println(total);
	}
}
