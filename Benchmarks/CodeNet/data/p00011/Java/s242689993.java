import java.util.*;

public class Main {
	public static void main(String[] args){
		String x="0";
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int p[] =new int[w];
		for(int i=0;i<w;i++){
			p[i]=i+1;
		}
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String str=sc.next();
			int a=str.charAt(0)-x.charAt(0);
			a--;
			int b=str.charAt(2)-x.charAt(0);
			b--;
			int t=p[a];
			p[a]=p[b];
			p[b]=t;
		}
		for(int i=0;i<w;i++){
			System.out.println(p[i]);
		}
	}
}