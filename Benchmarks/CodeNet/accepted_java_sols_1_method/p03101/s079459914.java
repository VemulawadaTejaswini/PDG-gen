import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int div = 0;
		int Hig = H - h;
		int Wid = W - w;
		
		div = Hig * Wid;
		
		System.out.println(div);
	}

}