import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ruikei = 0;
		for(int d=a;d<=b;d++) {
			if(c%d==0) {
				ruikei++;
			}
		}
		System.out.println(ruikei);
	}
}