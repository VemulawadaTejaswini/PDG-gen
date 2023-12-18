import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a,b,c,d,e,f,g,h,i,fx ;
		String ans = "No" ;

		a = N % 10 ; //1の位
		b = (N/10) % 10 ; //10の位
		c = (N/100) % 10 ; //100の位
		d = (N/1000) % 10 ; //1000の位
		e = (N/10000) % 10 ; //10000の位
		f =  (N/100000) % 10 ; //100000の位
		g = (N/1000000) % 10 ; //1000000の位
		h = (N/10000000) % 10 ; //10000000の位
		i = (N/100000000) % 10 ; //100000000の位
		fx = a+b+c+d+e+f+g+h+i ;

		if ( N % fx == 0 ) {
			ans = "Yes" ;
		}
		System.out.println(ans);
	}
}
