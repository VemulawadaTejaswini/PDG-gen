import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int H,W;
		String work[] = new String[2];

		while(true){

			try {
				work = br.readLine().split("[\\s]+");

				if(work[0].equals("0") && work[1].equals("0"))break;

				H = Integer.parseInt(work[0]);
				W = Integer.parseInt(work[1]);

				for(int col = 0; col < W; col++){
					System.out.printf("#");
				}
				System.out.printf("\n");

				for(int row = 1; row <= H-2; row++){
					System.out.printf("#");
					for(int col = 1; col <= W-2; col++){
						System.out.printf(".");
					}
					System.out.printf("#\n");
				}

				for(int col = 0; col < W; col++){
					System.out.printf("#");
				}
				System.out.printf("\n\n");


			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}


