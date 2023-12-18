import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if(b/a<c) {
			System.out.println(b/a);
		}else {
			System.out.println(c);
		}
		scn.close();
	}
}