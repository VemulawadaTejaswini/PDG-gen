import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args)throws IOException {
		//経過週数
		int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in), 64).readLine()); 
		//計算結果
		int result = 100000;
		
		//n週間後の借金を計算
		//0週間なら計算せず表示
		if (n != 0) {
			for(int i = 0; i < n;i++){
				result =(int)(result + (result * 0.05));
				if((result % 1000) != 0 ){
					result = ((int)(result / 1000) + 1) * 1000;
				}
			}
		}
		System.out.println(result);
	}
}