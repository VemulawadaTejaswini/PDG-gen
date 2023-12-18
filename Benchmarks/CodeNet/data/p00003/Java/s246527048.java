import java.util.Scanner;

public class Triangle {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		int b = Integer.parseInt(a);
		for(int i = 0;i<b;i++){
			String x = in.next();
			String y = in.next();
			String z = in.next();
			int p = Integer.parseInt(x);
			int q = Integer.parseInt(y);
			int r = Integer.parseInt(z);
			int a1,a2,a3;
			a1 = 0;
			a2 = 0;
			a3 = 0;
			a1 = Math.max(Math.max(p,q),Math.max(q,r));
			if(a1 == p){
				a2=Math.max(q,r);
				a3=Math.min(q,r);
			}
			if(a1 == q){
				a2=Math.max(p,r);
				a3=Math.min(p,r);
			}
			if(a1 == r){
				a2=Math.max(p,q);
				a3=Math.min(p,q);
			}
			if(p == q){
				if(p<r){
					a1=r;
					a2=p;
					a3=p;
				}
			}
			if(q == r){
				if(q<p){
					a1=p;
					a2=q;
					a3=q;
				}
			}
			if(p == r){
				if(p<q){
					a1=q;
					a2=p;
					a3=p;
				}
			}
			if(p ==q && q == r){
				System.out.println("NO");
			}
			if(a2*a2+a3*a3 == a1*a1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}