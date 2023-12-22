import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N =  Integer.parseInt(W.split(" ")[0]);
		int L =  Integer.parseInt(W.split(" ")[1]);

		int t = L;
		int sum = 0;
		for(int i=0;i<N;i++){
			sum+=t;
			t++;
		}
		if(L < 0){
			if((L+N -1)< 0){
				sum -= (L+N -1);
			}
		}else if(L == 0){

		}else{
			sum -= L;
		}

		System.out.println(sum);
	}
}
