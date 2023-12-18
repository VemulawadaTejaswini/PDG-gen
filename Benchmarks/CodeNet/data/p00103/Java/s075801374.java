import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int num_case = Integer.parseInt(br.readLine());
			boolean table[] = new boolean[3];

			for(int loop = 0; loop < num_case; loop++){

				int ans = 0,num_out = 0;
				for(int i = 0; i < 3; i++){

					table[i] = false;
				}

				while(num_out < 3){

					String event = br.readLine();

					switch(event){
					case "HIT":

						if(table[2]){
							ans += 1;
						}
						table[2] = table[1];
						table[1] = table[0];
						table[0] = true;
						break;

					case "HOMERUN":

						ans += 1;

						for(int i = 0; i < 3; i++){
							if(table[i]){
								ans += 1;
								table[i] = false;
							}
						}
						break;

					case "OUT":
						num_out += 1;
						break;
					}
				}

				System.out.println(ans);
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
