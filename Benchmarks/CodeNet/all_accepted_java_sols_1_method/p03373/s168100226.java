import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(a+b<=2*c) {
			System.out.println(a*x+b*y);
			return;
		}
		else if(a>=2*c&&b>=2*c){
			System.out.println(Math.max(x,y)*2*c);
			return;
		}
		else if(a<2*c&&b>=2*c) {
			System.out.println(y*2*c+Math.max(0, x-y)*a);
			return;
		}
		else if(b<2*c&&a>=2*c) {
			System.out.println(x*2*c+Math.max(0, y-x)*b);
			return;
		}
		else if(a<2*c&&b<2*c&&a+b>2*c) {
			int m=Math.min(x, y);
			System.out.println(m*2*c+(y-m)*b+(x-m)*a);
			return;
		}
		
		
	}
}
