import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] S = new int[n];
		for(int i = 0; i < n; i++){
			S[i] = Integer.parseInt(str[i]);
		}
		
		int q = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		int[] T = new int[q];
		for(int i = 0; i < q; i++){
			T[i] = Integer.parseInt(str[i]);
		}
		
		int count = 0;
		for(int i = 0; i < q; i++){
			for(int j = 0; j < n; j++){
				if(T[i] == S[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
