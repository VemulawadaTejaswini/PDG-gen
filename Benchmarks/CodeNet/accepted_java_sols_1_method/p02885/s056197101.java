
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(a-2*b<=0) {
			System.out.println(0);
		}else{
			System.out.println(a-2*b);
		}
	}

}
