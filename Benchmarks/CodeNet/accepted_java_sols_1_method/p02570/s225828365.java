import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float D = sc.nextFloat();
		float T = sc.nextFloat();
		float S= sc.nextFloat();

		if(D / S <= T){System.out.println("Yes");} else {System.out.println("No");}
	}
}