//基本的に a_i が高い刀で"振る"
//投げつけ合計 >= 残りH の場合に投げつけ でOK


import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int   N = sc.nextInt();
		int   H = sc.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i = 0 ; i < N ; i ++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int attackCount = 0;
		int RemainderH = H;
		
		//"振る"威力が最大である刀の威力を検索
		
		IntStream  streamA = Arrays.stream(a);
		IntStream  streamB = Arrays.stream(b);
		
		int MaxA = streamA.max().getAsInt();
		
		int SumB = streamB.filter(n -> n >= MaxA ).reduce(0,(x,y) -> x+y);
		Arrays.sort(b);  //【注意】 配列b が昇順に変更になる
		int thrownCount = 0;
		
		while(RemainderH > 0){
			if(RemainderH <= SumB){
				RemainderH = RemainderH - b[ N - 1 -thrownCount];
				thrownCount++;
				attackCount++;
			}else{
				RemainderH = RemainderH - MaxA ;
				attackCount++;
			}
		}
		
		System.out.println(attackCount);
	}
}
