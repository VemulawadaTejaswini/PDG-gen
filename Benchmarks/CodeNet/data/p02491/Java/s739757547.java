import java.util.*;
class Main{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int d,r;
	double f;
	d=a/b;
	r=a%b;
	f=(double)a/b;
	System.out.printf("%d %d %.5f",d,r,f);
	}
}