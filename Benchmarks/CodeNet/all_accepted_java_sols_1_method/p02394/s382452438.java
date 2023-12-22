import java.util.Scanner;
public class Main{

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if((x + r > W || x - r < 0) || (y + r > H || y - r < 0)) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
