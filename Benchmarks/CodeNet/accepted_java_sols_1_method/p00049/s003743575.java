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
			
			rrr = tmp.split(",");
			
			if(rrr[1].equals("A")){
				abo[0]++;
			}else if(rrr[1].equals("B")){
				abo[1]++;
			}else if(rrr[1].equals("AB")){
				abo[2]++;
			}else if(rrr[1].equals("O")){
				abo[3]++;
			}
		}
		System.out.println(abo[0]);
		System.out.println(abo[1]);
		System.out.println(abo[2]);
		System.out.println(abo[3]);
	}

}