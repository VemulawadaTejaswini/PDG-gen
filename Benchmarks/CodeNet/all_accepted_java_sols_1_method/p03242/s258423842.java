import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=0;
		if(a%10==1) {
			b+=9;
		}
		else {
			b+=1;
		}
		a/=10;
		if(a%10==1) {
			b+=90;
		}
		else {
			b+=10;
		}
		a/=10;
		if(a%10==1) {
			b+=900;
		}
		else {
			b+=100;
		}
		System.out.println(b);
		}
}