//2019/3/14
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int nn = n;

		int a = String.valueOf(n).length();

		int Sn = 0;

		while(a>0) {

			Sn += nn % 10;

			nn /= 10;

			a--;
		}

		Sn += nn;

		if(n%Sn==0)System.out.println("Yes");

		else System.out.println("No");

	}

}
