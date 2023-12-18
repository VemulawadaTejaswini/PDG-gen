import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int ans = (H-h)*(W-w);
		System.out.println(ans);
		sc.close();
	}
	

}