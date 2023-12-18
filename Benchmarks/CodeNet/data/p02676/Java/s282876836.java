import java.util.Scanner;
public class Main{
	int o,h,s,e;
	double q,w,a;
	String  i,l,k;
	Scanner scan=new Scanner(System.in);
	public void output() {
h=scan.nextInt();
i=scan.next();
o=i.length();
l=i.substring(0,h);
if(h>o) {
	System.out.println(i);
}else {
	System.out.println(l+"...");
}
	}
	public static void main(String[] args) {
		Main p=new Main();
		p.output();
	}
}