
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int aa=sc.nextInt();
		int bb= sc.nextInt();

		int a=Math.min(aa, bb);
		int b=Math.max(aa, bb);
		int c;

		while(b%a!=0){
			c=a;
			a=b%a;
			b=c;
		}

		System.out.println(a);

	}
}
