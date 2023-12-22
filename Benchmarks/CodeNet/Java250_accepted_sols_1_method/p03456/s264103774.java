import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=b;
		for(int i=0;;i++) {
			if(c!=0) {
			a*=10;
			}
			else {
				break;
			}
			c/=10;
		}double d=0;
		int e=a+b;
		d=Math.sqrt(e);
		if(d==(int)d) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}