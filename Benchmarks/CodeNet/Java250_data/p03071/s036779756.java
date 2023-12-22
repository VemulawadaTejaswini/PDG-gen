
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(a>b&&b>a-1) {
			System.out.println(a+b);
		}else if(a>b&&a-1>=b) {
			System.out.println(a+a-1);
		}else if(a>b-1) {
			System.out.println(a+b);
		}else {
			System.out.println(b+b-1);
		}
	}

}
