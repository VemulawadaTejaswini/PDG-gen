import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int S = scn.nextInt();
		int h = S/3600;
		int m = (S%3600)/60;
		int s  =(S%3600)%60;
		System.out.print(h + ":" + m + ":" + s);
	}
}

