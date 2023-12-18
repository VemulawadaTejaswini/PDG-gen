import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int W,H,x,y,r;
		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		
		if (x>0&&y>0) {
			if ((W >= x + r && 0 <= x + r) && (H >= y + r && 0 <= y + r))
				System.out.println("Yes");
			else
				System.out.println("No");
		}else
			System.out.println("No");
	}

}