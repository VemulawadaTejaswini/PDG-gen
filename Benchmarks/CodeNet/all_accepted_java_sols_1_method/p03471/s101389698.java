import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		y= y/1000;
		int a=0;
		int b=0;
		int c=0;
		int flag=0;
		int result=0;
		for(a=y/10; a>=0; a--) {
			for(b=y/5; b>=0; b--) {
				c=n-a-b;
				if(c<0) {
					continue;
				}
				result = 10*a + 5*b +c;
				if(result==y) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
			if(flag==0) {
				a=-1;
				b=-1;
				c=-1;
			}
			System.out.println(a+" "+b+" "+c);
	}
}
