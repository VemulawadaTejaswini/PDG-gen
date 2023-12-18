import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			while(true){

				//空白で分割
				String[] s = br.readLine().split(" ");

				//数値に変換
				int a = Integer.valueOf(s[0]);
				int b = Integer.valueOf(s[1]);

				//条件
				if(a==0 || b==0){ break; }
				if(a<b){
					System.out.println(a + " " + b);
				}else{
					System.out.println(b + " " + a);
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}