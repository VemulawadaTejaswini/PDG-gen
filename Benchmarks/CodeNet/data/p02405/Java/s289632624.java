import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if(h == 0 && w == 0) break;

			int switchFlag = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(switchFlag == 0) System.out.print("#");
					else System.out.print(".");
					if(j != w-1) switchFlag = Math.abs(switchFlag - 1);
				}
				System.out.println("");
			}
		}

		sc.close();

	}

}

