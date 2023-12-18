
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String s=scn.next();
		if(n<3200) {
			System.out.println("red");
		}else {
			System.out.println(s);
		}
	}

}
