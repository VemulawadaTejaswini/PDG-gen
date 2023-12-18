import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
m=sc.nextInt();
for(o=0;o<n;o++) {
	p=sc.nextInt();
	as=sc.nextInt();
	p=p*p;
	as=as*as;
	hun=p+as;
	//Math.sqrt(hun);
	if(Math.sqrt(hun)<=m) {
		kl=kl+1;
		//System.out.println(kl);
	}
}
System.out.println(kl);
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}