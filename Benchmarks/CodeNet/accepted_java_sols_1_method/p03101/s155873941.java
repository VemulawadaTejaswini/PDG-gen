import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		H -= sc.nextInt();
		W -= sc.nextInt();
		
		System.out.println(H * W);
		sc.close();
	}

}
