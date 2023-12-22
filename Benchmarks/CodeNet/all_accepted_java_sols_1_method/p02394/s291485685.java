import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int W,H,x,y,r;
		Scanner scanner = new Scanner(System.in);
		W = scanner.nextInt();
		H = scanner.nextInt();
		x = scanner.nextInt();
		y = scanner.nextInt();
		r = scanner.nextInt();

		if(y >= r && y <= H-r && x >=r && x <= W-r){
			System.out.printf("Yes\n");
		}else{
			System.out.printf("No\n");
		}

	}
}

