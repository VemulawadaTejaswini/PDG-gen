import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int l = 0;
		int r = w;
		int u = h;
		int d = 0;
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a==1)l = Math.max(l, x);
			else if(a==2)r = Math.min(r, x);
			else if(a==3)d = Math.max(d, y);
			else u  = Math.min(u, y);
		}
		System.out.println(r-l<0 || u-d<0 ? 0 : (r-l)*(u-d));
	}
}