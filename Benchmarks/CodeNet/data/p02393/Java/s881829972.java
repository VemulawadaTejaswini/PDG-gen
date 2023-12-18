import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,bufa;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b){
			bufa = a;
			a = b;
			b = bufa;
		}
		if(b>c){
			bufa = c;
			c = b;
			b = bufa;
		}
		if(a>b){
			bufa = a;
			a = b;
			b = bufa;
		}
		System.out.println(a+" "+b+" "+c);
	}

}