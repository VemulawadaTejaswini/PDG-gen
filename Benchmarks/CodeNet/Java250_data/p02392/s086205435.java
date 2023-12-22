import java.util.Scanner;

class Main{

	public static void main(String[] args) {

	int[] n;
	n = new int[3];

	Scanner scan = new Scanner(System.in);

	n[0] = scan.nextInt();
	n[1] = scan.nextInt();
	n[2] = scan.nextInt();

	if(n[0] < n[1] && n[1] < n[2]) System.out.println("Yes");
	else System.out.println("No");

	scan.close();
	}
}