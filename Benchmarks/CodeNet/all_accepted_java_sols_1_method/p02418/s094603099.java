import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String T = br.readLine();
			String P = br.readLine();

			if(P.length() <= T.length()){

				char T_array[] = T.toCharArray();
				char P_array[] = P.toCharArray();

				boolean Found = false,FLG;

				for(int start = 0; start < T.length(); start++){
					FLG = true;
					for(int i = 0; i < P.length(); i++){
						if(P_array[i] != T_array[(start+i)%T.length()]){
							FLG = false;
							break;
						}
					}
					if(FLG){
						Found = true;
						break;
					}
				}

				if(Found){
					System.out.printf("Yes\n");
				}else{
					System.out.printf("No\n");
				}

			}else{

				System.out.printf("No\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
