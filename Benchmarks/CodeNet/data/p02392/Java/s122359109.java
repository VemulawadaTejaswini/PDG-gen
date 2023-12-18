import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a;
		int b;
		int c;

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if((a < b) && (b < c)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}