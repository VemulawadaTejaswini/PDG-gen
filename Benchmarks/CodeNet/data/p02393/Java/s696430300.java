import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int swap=0;
		
		if(a>b) {
			swap=a;
			a=b;
			b=swap;
		}
		if(a>c) {
			swap=a;
			a=c;
			c=swap;
		}
		if(b>c) {
			swap=c;
			c=b;
			b=swap;
		}
		
		System.out.printf("%d %d %d%n",a,b,c);
	}

}
