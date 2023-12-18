import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		try{
			while((str = br.readLine()) != null){
				int n = Integer.parseInt(str);
				// メソッドと引数を分離

				String array[] = str.split(" ");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}