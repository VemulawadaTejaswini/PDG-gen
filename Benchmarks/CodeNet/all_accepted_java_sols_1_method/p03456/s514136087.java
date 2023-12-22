import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B = sc.nextInt();
		String temp = String.valueOf(B);
		A= (int) (A*Math.pow(10, temp.length())+B);
		boolean b = false;
		for (int i=1;i*i<=A;i++) {
			if (i*i==A) {
				b= true;
			}
		}
		if (b==true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}