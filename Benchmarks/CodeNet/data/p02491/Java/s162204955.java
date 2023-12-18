import java.util.*;
class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
if(b!=0) d=a/b;
else d=0;
r=a%b;
double f = (double)a/(double)b;
		System.out.println("%d %d %5f",d,r,f);
	}
}