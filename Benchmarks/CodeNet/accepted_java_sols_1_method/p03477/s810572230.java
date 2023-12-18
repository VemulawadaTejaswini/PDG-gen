import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int  a=stdin.nextInt();
		int  b=stdin.nextInt();
		int  c=stdin.nextInt();
		int  d=stdin.nextInt();
		int l=a+b;
		int r=c+d;

		if(l>r)
			System.out.println("Left");
		else if(l<r)
			System.out.println("Right");
		if(l==r)
			System.out.println("Balanced");
	}
}