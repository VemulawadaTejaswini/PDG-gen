
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=1;
		int d=0;
		while(c<b) {
			c+=(a-1);
			d++;
		}
		System.out.println(d);

	}

}
