import java.util.Scanner;

public class Main {

		/**
		 * それぞれの購入地点から得られる最大利ざやを求め、
		 * 最も利益の大きい値を出力する
		 * @param args
		 */
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int[] value = new int[num];
			for(int i = 0;i < num;i++){
				value[i] = scan.nextInt();
			}

		
			
			System.out.println(ExchangeMax(value));
			
			scan.close();
				
		/*	long profit = -999999999;
			for(int i = 0; i< num; i++){
				if(profit < Exchange(value[i],value,i+1)){
					profit = Exchange(value[i],value,i+1);
				}
			}
			System.out.println(profit);
			*/
		}
		
		/**
		 * 
		 */
		static int ExchangeMax(int[] value){
			int max = Integer.MIN_VALUE;
			int min = value[0];
			for(int i = 1; i < value.length;i++){
				max = Math.max(max, value[i] - min);
				min = Math.min(min, value[i]);
			}
			return max;
		}
		/**
		 * 購入地点からの最大利ざやを求める
		 * @param buy		買値
		 * @param value	価格変動値
		 * @param n		何番目から売りに入るか
		 * @return
		 */
		static long Exchange(int buy, int[] value,int n){
			long max_sell = -999999999;
			for(int i = n; i < value.length;i++){
				if(max_sell < value[i]){
					max_sell = value[i];
				}
			}
			return max_sell - buy;
			}
}


