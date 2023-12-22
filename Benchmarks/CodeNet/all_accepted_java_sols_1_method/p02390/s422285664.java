import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int x,y,z;
		z=i/3600%60;
		y=(i-3600*z)/60%60;
		x=(i-3600*z)-(60*y);
			System.out.println(z +":"+ y +":"+ x);
	}

}