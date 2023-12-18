import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int taihi;
		for(int i=1;i<=3000;i++) {
			if(x<=0 && y<=10000) {
			}
				if(x>y) {
					taihi=y;
					y=x;
					x=taihi;
			}
				System.out.println(x+" "+y);
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0) {
				break;
			}
		}
	}
}