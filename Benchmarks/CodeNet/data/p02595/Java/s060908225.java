import java.util.Scanner;
public class Main {
	//int ;
	long m,hun,as,kl,o,n,p,k,l;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
m=sc.nextInt();
m=m*m;
for(o=0;o<n;o++) {
	as=sc.nextInt();
	kl=sc.nextInt();
	if(kl<0) {
		kl=kl*-1;
	}else if(as<0) {
		as=as*-1;
	}
	
	k=as*as;
	l=kl*kl;
	hun=k+l;
	if(m>=hun) {
		p=p+1;
	}
}
System.out.println(p);
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}