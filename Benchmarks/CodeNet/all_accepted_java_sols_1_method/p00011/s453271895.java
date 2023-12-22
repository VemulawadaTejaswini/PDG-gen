import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int w,n;
		int a,b;
		int[] d;
		w=sc.nextInt();
		n=sc.nextInt();
		d=new int[w+1];
		for(int i=1;i<=w;i++)d[i]=i;
		for(int i=0;i<n;i++){
			String str=sc.next();
			String[] ab=str.split(",");
			a=Integer.parseInt(ab[0]);
			b=Integer.parseInt(ab[1]);
			int t=d[a];
			d[a]=d[b];
			d[b]=t;

		}
		for(int i=1;i<=w;i++)System.out.printf("%d\n",d[i]);
	}
}