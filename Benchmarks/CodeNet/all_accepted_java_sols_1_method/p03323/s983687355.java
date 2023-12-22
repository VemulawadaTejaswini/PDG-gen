import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(a >8 || b>8) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
		scn.close();
	}
}