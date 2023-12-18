import java.util.Scanner;
class Main {   
	int o,n;
	Scanner scan =new Scanner(System.in);
	public void solve(){
	String	s=scan.next();
//System.out.println(s);
String[] a = s.split("");
for(String e : a) {
	//System.out.println(e);
	if(e.equals("?")) {
	 o=+1;
	}else {
		 n=+1;
	}
}
//System.out.println(o);
//System.out.println(n);
int h=o%2;
//System.out.println(h);
int l=n+h;
System.out.println(l);
    } 
	 public static void main(String[] a) { 
		 new Main().solve();
		 } 
}