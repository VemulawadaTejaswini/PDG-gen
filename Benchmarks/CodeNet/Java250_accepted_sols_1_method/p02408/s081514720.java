import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int table[] = new int[128];
		String work[] = new String[2];
		String outPut[] = {"S","H","C","D"};

		table['S'] = 0;
		table['H'] = 1;
		table['C'] = 2;
		table['D'] = 3;

		boolean check[][] = new boolean[4][14];
		for(int row = 0; row < 4; row++){
			for(int col = 1; col <= 13; col++)check[row][col] = false;
		}

		try {
			int N = Integer.parseInt(br.readLine());

			for(int loop = 0; loop < N; loop++){
				work = br.readLine().split("\\s+");
				check[table[work[0].charAt(0)]][Integer.parseInt(work[1])] = true;
			}

			for(int row = 0; row < 4; row++){
				for(int col = 1; col <= 13; col++){
					if(!check[row][col]){
						System.out.printf("%s %d\n", outPut[row],col);
					}
				}
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


