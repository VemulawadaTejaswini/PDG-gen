import java.util.Scanner;
public class Main {
	int as,kl,o;
	String n,m;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
	n=sc.next();
	m=sc.next();
	//String[] date=new String[n.length()];
	//String[] dat=new String[n.length()];
	//for(o=0;o<n.length();o++) {
	String[]	date=n.split("");
	String[]	dat=m.split("");
	//}
	for(o=0;o<n.length();o++) {
		//System.out.println(date[o]);
	//	System.out.println(dat[o]);
		if(date[o].equals(dat[o])) {
			as=as+1;
		}
	}
	as=n.length()-as;
	System.out.println(as);
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}
