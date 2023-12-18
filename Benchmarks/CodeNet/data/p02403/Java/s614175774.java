import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x,y;
		while(true) {
			int H=scan.nextInt();
			int W=scan.nextInt();
			for(x=0;x<H;x++) {
				for(y=0;y<W;y++) {
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			if(H == 0 && W == 0) break;
		}
		scan.close();
}
}
