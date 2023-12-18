import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
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
		double mon = 0;
		int syo=0,hisi=0;
		double aaaa = 1;
		
		
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
			
			for(int i=0;i<tmp.length();i++){
				if(tmp.charAt(i) == '@'){
					for(int j=0;j<Integer.parseInt(String.valueOf(tmp.charAt(i+1)));j++){
						System.out.print(tmp.charAt(i+2));
					}
					i +=2;
					
				}else{
					System.out.print(tmp.charAt(i));
				}
			}
			System.out.println();
			
		}
	}

}