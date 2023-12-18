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
				int x = Integer.valueOf(s[0]);
				int y = Integer.valueOf(s[1]);

				//条件
				if(x==0 && y==0){ break; }
				if(x<y){
					System.out.println(x + " " + y);
				}else{
					System.out.println(y + " " + x);
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}