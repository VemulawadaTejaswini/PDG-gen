import java.util.Scanner;

//	???????????´??°?????????????????????
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n;
		
		if(a >b && b>c){
			n=a;
			a=c;
			c=n;
		}
		else if(a>b){
			n=a;
			a=b;
			b=n;
			if(b>c){
				n=b;
				b=c;
				c=n;
			}
		}
		else if(a>c){
			n=a;
			a=c;
			c=n;
			if(b>c){
				n=b;
				b=c;
				c=n;
			}
		}
		else if(b>c){
			n=b;
			b=c;
			c=n;
		}
		System.out.printf("%d %d %d\n", a,b,c);
	}
}