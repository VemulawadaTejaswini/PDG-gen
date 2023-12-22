
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		String str=scn.next();
		System.out.println(str.substring(0, k-1)+""+(char)(str.charAt(k-1)+32)+""+str.substring(k));
	}

}
