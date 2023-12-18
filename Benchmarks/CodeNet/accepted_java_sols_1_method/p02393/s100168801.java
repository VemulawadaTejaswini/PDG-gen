import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=0;
		if(a>b) {
			k=b;
			b=a;
			a=k;
		}
		if(b>c) {
			k=c;
			c=b;
			b=k;
		}
		if(a>b) {
			k=b;
			b=a;
			a=k;
		}
		System.out.println(a+" "+b+" "+c);
	}
}

