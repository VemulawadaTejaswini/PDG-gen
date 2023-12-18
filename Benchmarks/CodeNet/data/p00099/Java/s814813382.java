import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		
		ArrayList<Integer> fas = new ArrayList<Integer>();
		ArrayList<Integer> has = new ArrayList<Integer>();
		ArrayList<Integer> las = new ArrayList<Integer>();
		ArrayList<Integer> las2 = new ArrayList<Integer>();
		int counta=0;
		
		
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
			
			String[] sprite1 = tmp.split(" ");
			tmp1 = Integer.parseInt(sprite1[0]);
			tmp2 = Integer.parseInt(sprite1[1]);
			sanka[tmp1-1] += tmp2;
			
			int max = 0;
			int min = 999999999;
			int tmpp = -9999999;
			
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