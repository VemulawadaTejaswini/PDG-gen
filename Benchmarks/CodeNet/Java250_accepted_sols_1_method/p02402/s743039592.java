import java.util.*;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); //入力データ数用
		int fst;				//比較初期値
		int min = 0;			//最大値用変数とりあえず０で初期化
		int max = 0;			//最小値用変数とりあえず０で初期化
		long sum = 0;     		//合計用変数
		for(int i = 0; i < cnt; i++){
			fst = sc.nextInt();
			if(i == 0){min = max = fst;}
			if(min > fst){ min = fst;}
			if(max < fst){ max = fst;}
			sum += fst;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}