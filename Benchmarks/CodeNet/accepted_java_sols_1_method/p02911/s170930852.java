import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,k,q;
		n=sc.nextInt();
		k=sc.nextInt();
		q=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=k-q;
		}
		for(int i=0;i<q;i++) {
			int a=sc.nextInt()-1;
			p[a]++;
		}
		for(int i=0;i<n;i++) {
			if(p[i]>0)System.out.println("Yes");
			else System.out.println("No");
		}
	}

}
