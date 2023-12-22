import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BigDecimal one = new BigDecimal("1.00");
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
		long aaaa = 1;
		
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			
			if(tmp.equals("")){
				break;
			}
			
			mon = Integer.parseInt(tmp);
			
			
			int abc = 2;
			for(int i=2;i<mon+1;i++){
				abc = abc + i;
			}
			if(mon == 0){
				abc = 1;
			}
			System.out.println(abc);
			
		}
	}

}