import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y=0;
		while(true) {
			x=sc.nextInt();
			y=sc.nextInt();
			if(x==0&&y==0)break;
			else if(x>y)System.out.println(y+" "+x);
			else if(y>x)System.out.println(x+" "+y);
			else if(x==y)System.out.println(x+" "+y);
		}
	}
}
