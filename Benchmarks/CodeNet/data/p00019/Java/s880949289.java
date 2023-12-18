import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		int[] abo = {0,0,0,0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		int mon = 0;
		int syo=0,hisi=0;
		int aaaa = 1;
		
		
		//while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
//			if(tmp == null){
//				break;
//			}
//			
//			if(tmp.equals("")){
//				break;
//			}
			
			mon = Integer.parseInt(tmp);
			
			
			for(int i=1;i<mon+1;i++){
				aaaa = aaaa*i;
			}
			
			System.out.println(aaaa);
			
		//}
	}

}