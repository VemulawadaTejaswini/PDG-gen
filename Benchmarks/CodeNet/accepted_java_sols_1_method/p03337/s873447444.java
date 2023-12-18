import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		int wa=a+b;
		int sa=a-b;
		int seki=a*b;
		if(wa>=sa&&wa>=seki) {
			System.out.print(wa);
		}
		else if(sa>=wa&&sa>=seki) {
			System.out.print(sa);
		}
		else {
			System.out.print(seki);
		}

	}

}
