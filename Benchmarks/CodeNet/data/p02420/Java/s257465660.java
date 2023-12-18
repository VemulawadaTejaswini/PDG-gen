import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String first;
		char table[] = new char[20000];

		int M,h,left,right;


		try {

			while(!(first = br.readLine()).equals("-")){

				for(int i = 0; i < first.length(); i++){
					table[i] = first.charAt(i);
				}

				left = 0;
				right = first.length()-1;

				M = Integer.parseInt(br.readLine());

				for(int loop = 0; loop < M; loop++){
					h = Integer.parseInt(br.readLine());

					for(int i = 0; i < h; i++){
						table[right+1+i] = table[left+i];
					}
					left += h;
					right += h;
				}

				for(int i = left; i <= right; i++){
					System.out.printf("%c", table[i]);
				}
				System.out.printf("\n");
			}


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
