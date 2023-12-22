import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		int n, m, c, e, min;
		boolean judge;
		while(true){
			string = reader.readLine();
			n = Integer.valueOf(string.split(" ")[0]);
			m = Integer.valueOf(string.split(" ")[1]);
			if((n | m) == 0) break;
			
			int taro[] = new int[n];
			int hana[] = new int[m], sumT = 0, sumH = 0;
			c = e = 0;
			for(int i = 0; i < n; i++){
				taro[i] = Integer.valueOf(reader.readLine());
				sumT += taro[i];
			}
			for(int i = 0; i < m; i++){
				hana[i] = Integer.valueOf(reader.readLine());
				sumH += hana[i];
			}
			min = 114514;
			judge = false;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					if(sumT - taro[i] + hana[j] ==
					   sumH + taro[i] - hana[j] &&
					   taro[i] + hana[j] < min){
						
						if(!judge) judge = true;
						min = taro[i] + hana[j];
						c = taro[i];
						e = hana[j];
					}
				}
			}			
			if(judge){
				System.out.println(c + " " + e);
			}else{
				System.out.println(-1);
			}
		}
		
		reader.close();
	}
}