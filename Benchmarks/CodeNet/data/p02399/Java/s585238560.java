import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int a,b,d,r;
	double f;
	Scanner scan = new Scanner(System.in);
	
	a= Integer.parseInt(scan.next());
	b= Integer.parseInt(scan.next());
	d=a/b;
	r=a%b;
	f=(double)a/(double)b;

	
	System.out.printf("%d %d %.5f",d,r,f);
	}
	
}