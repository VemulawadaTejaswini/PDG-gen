import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		int mon = 0;
		int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		
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
			
			rrr = tmp.split(" ");
			
			for(int i=0;i<rrr.length;i++){
				
				if(rrr[i].length() >= st){
					st = rrr[i].length();
					ter = i;
				}
				sr = 0;
				for(int j=0;j<rrr.length;j++){
					if(rrr[i].equals(rrr[j])){
						sr++;
					}
				}
				if(sr >=mun){
					mun = sr;
					cup = i;
				}
				
			}
			
			System.out.println(rrr[cup]+" "+rrr[ter]);
			
		}
	}

}