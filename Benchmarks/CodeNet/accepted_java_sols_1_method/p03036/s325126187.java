
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int r=scn.nextInt();
		int d=scn.nextInt();
		int x=scn.nextInt();
		
		for(int i=1;i<=10;i++) {
			x=r*x-d;
			System.out.println(x);
		}
	}

}
