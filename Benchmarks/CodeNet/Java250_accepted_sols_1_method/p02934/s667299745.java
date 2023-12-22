import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double m = 0;
		for(int i = 0 ;i < n;i++) {
			 m+=1/scn.nextDouble();
		}
		System.out.println(1/m);
		scn.close();
	}
}