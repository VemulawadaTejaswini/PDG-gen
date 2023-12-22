import java.util.Scanner;
public class Main {

	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static int lcm (int a, int b) {return a*b/gcd(a,b);}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				if(a-i-j<0) {
					break;
				}
				int _10000=10000*i;
				int _5000=5000*j;
				int _1000=1000*(a-i-j);
				if(_10000+_5000+_1000==b) {
					System.out.println(i+" "+j+" "+(a-i-j));
					return;
				}
			}
		}
		System.out.println(-1+" "+-1+" "+-1);
	}

}
