import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W);
		W = in.readLine();

		String[] Ws = W.split(" ");

		int[] list = new int[N];
		for(int i=0;i<N;i++){
			list[i] = Integer.parseInt(Ws[i]);
		}

		int i=1;
		int ans = 0;

		for(int k=0;k<N;k++){
			if(list[k]==i){
				i++;
			}else{
				ans++;
			}
		}
		if(i==1){
			ans = -1;
		}
		System.out.println(ans);



	}
}
