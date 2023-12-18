
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] a=new int[m];
		int[] b=new int[m];
		int[] x=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=i;
		}
		
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			x[a[i]]=x[a[i]];
			x[b[i]]=x[a[i]];
		}
		HashSet hs = new HashSet();
		for(int i=0;i<n;i++) {
		hs.add(x[i]);
		}
		int j=hs.size();
		System.out.println(n-j-1);
		
		sc.close();
		}
	}