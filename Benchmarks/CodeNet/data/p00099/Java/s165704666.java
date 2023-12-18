import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		int counta=0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		
		try {
			tmp = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		String[] sprite = tmp.split(" ");
		
		counta = Integer.parseInt(sprite[0]);
		
		int[] sanka = new int[counta];
		
		int countb = Integer.parseInt(sprite[1]);
		
		int tmp1,tmp2;
		
		for(i=0;i<countb;i++){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			sprite = tmp.split(" ");
			tmp1 = Integer.parseInt(sprite[0]);
			tmp2 = Integer.parseInt(sprite[1]);
			sanka[tmp1-1] += tmp2;
			
			max = 0;
			min = Integer.MAX_VALUE;
			tmpp = Integer.MAX_VALUE;
			
			for(int j=0;j<counta;j++){
				if(max <= sanka[j]){
					if(tmpp == sanka[j]){
						if(min > j){
							max = sanka[j];
							min = j;
							tmpp = sanka[j];
						}
					}
					else{
						max = sanka[j];
						min = j;
						tmpp = sanka[j];
					}
					
				}
			}
			
			System.out.println(min+1+" "+max);
			
//			for(int h=0;h<counta;h++){
//				System.out.print(sanka[h]);
//			}
//			System.out.println("x");
		}
		
	}
}