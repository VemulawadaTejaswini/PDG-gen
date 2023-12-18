import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		if(x==1)System.out.println("Yes");
		else {
			if(y>=(2*x) && y<=(4*x) && y%2==0) System.out.println("Yes");
			else System.out.println("No");
		}
		

	}

}
