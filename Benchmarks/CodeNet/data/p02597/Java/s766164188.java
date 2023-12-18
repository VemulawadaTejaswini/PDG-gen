import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
op=sc.next();
String[] date=op.split("",0);
for(o=0;o<n;o++) {
	if("R".equals(date[o])) {
	p=p+1;
}else {
	kl=kl+1;
}
}
if(p<kl) {
	System.out.println(p);
}else {
	System.out.println(kl);
}
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}
