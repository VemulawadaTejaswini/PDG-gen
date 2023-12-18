import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		while(true) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			if(H==0&&W==0) {
				break;
			}
			boolean tmp = false;

			for(int i=0;i<H;i++) {

				for(int j=0;j<W;j++) {
					if(!tmp) {
						System.out.print("#");
						tmp = true;
					}else {
						System.out.print(".");
						tmp = false;
					}
				}
				if(W%2==0) {
					if(tmp) {
						tmp = false;
					}else {
						tmp = true;
					}
				}
				System.out.println();
			}
			System.out.println();
		}

		sc.close();
	}
}
