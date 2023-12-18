
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int h=scn.nextInt();
		int w=scn.nextInt();
		System.out.println((n-h+1)*(n-w+1));
	}

}
