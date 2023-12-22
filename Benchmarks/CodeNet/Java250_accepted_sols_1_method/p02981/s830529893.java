
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int t1=scn.nextInt();
		int t2=scn.nextInt();
		if(n*t1<t2) {
			System.out.println(n*t1);
		}else {
			System.out.println(t2);
		}
	}

}
