import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
	//計算用array
	static int[] array = new int[101];
	static int[] temporary = new int[102];
	//ただ読み込むのみ
	static String[] read = new String[300];
	//計算用arrayのindex
	static int count = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String string = br.readLine();
			StringTokenizer tokenizer = new StringTokenizer(string," ");
			//一度すべて読み込んでしまう
			int i = 0;
			while (tokenizer.hasMoreTokens()) {
				read[i] = tokenizer.nextToken();
				i++;
			}
			
			int j =0;
			while(read[j]!=null){
				
				String next = read[j];
				if(next.equals("+")){
					popcalc(0);
				}else if(next.equals("-")){
					popcalc(1);
				}else if (next.equals("*")) {
					popcalc(2);
				}else{
					int number = Integer.parseInt(next);
					push(number);
				}
			
				j++;
			}
			
		System.out.println(array[0]);
	}

	
	//popメソッド
	public static void popcalc(int judge) {
	//上から2個とる、1つずつずらす、計算結果をpushする。
		int answer;
		int first = array[0];
		int second = array[1];
		
		//先に計算
		if(judge == 0){
			//足し算
			//System.out.println("たしざん");
			answer=first+second;
		}else if (judge == 1) {
			//引き算
			answer=second-first;
		}else{
			answer=first*second;
		}
		//コピー
		for(int i=0;i<array.length-1;i++){
			temporary[i] = array[i];
		}
		for(int i=2;i<array.length;i++){
			array[i-1]=temporary[i];
		}
		array[0]=answer;
	}
	
	
	//pushメソッド
	public static void push(int number){
		//numberを0番目に、それぞれ一個ずつずらしていく
		
		//同じ配列を複製
		for(int i=0;i<array.length-1;i++){
			temporary[i] = array[i];
		}
		for(int i =0;i<array.length-1;i++){
			array[i+1] = temporary[i];
		}
		array[0]=number;
	}
}