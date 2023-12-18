import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CopyOfMain01_08B1 {

	public static void main(String[] args) throws IOException{
		// 入力導入部
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int x=0;
			String str=br.readLine();
			if(str.equals("0"))break;
			String[] st=str.split("");
			for(int i=0;i<st.length;i++){
				x+=Integer.parseInt(st[i]);
				}
			System.out.println(x);
		}br.close();

		}}