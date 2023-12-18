import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[2];
		num[0] = scn.nextInt();
		num[1] = scn.nextInt();
		double a = num[0];
		double b = num[1];
		System.out.println(num[0]/num[1] +" "+ num[0]%num[1] +" "+ a/b );
	}
}

