import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op,ta;
	Scanner sc = new Scanner(System.in);
	public void solve() {
		op=sc.next();
		ta=sc.next();
		
		for(o=0;o<ta.length();o++){
			
			if(op.indexOf(ta.substring(o))>=0) {
			//	System.out.println(o);
				as=o;
				break;
			}
			
		//	System.out.println(ta.substring(o));
		}
		n=ta.length();
for(o=1;o<ta.length()-1;o++){
			n=n-o;
			if(op.indexOf(ta.substring(0,n))>=0) {
			//	System.out.println(o);
				kl=o;
				break;
			}
			
			//System.out.println(ta.substring(0,1));
		}
if(as>kl) {
	System.out.println(kl);
}else {
	System.out.println(as);
}
	}
	public static void main(String[] args) {
		new Main().solve();
	}
}