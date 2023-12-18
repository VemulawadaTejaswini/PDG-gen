import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
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
		char[] ccc,ddd;
		
		
		try {
			tmp = br.readLine();
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		mun = Integer.parseInt(tmp);
		
		int tmo;
		
		for(int i=0;i<mun;i++){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			ccc = new char[tmp.length()];
			ddd = new char[tmp.length()];
			for(int j=0;j<tmp.length();j++){
				ccc[j] = tmp.charAt(j);
				ddd[j] = tmp.charAt(j);
			}
			
			for(int s=0;s<ccc.length;s++){
				for(int j=0;j<ccc.length;j++){
					if(ccc[s] < ccc[j]){
						tmo = ccc[s];
						ccc[s] = ccc[j];
						ccc[j] = (char) tmo;
					}
					if(ddd[s] > ddd[j]){
						tmo = ddd[s];
						ddd[s] = ddd[j];
						ddd[j] = (char) tmo;
					}
				}
			}
			String tyu = String.valueOf(ccc);
			String ghj = String.valueOf(ddd);
			System.out.println((Integer.parseInt(tyu) - Integer.parseInt(ghj)));
		}

	}

}