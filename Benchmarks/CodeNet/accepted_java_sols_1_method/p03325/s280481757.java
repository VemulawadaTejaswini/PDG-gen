import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// 配列
    	long[] list = new long[N];
    	for(int i = 0; i < N; ++i){
      	list[i] = sc.nextLong();
    	}
        //カウント
     	 int count =0;
      
      for(int i=0; i<N; i++) {
      while(list[i] % 2 == 0){
        list[i] = list[i] / 2;
        count = count+1;
       }
      }
         // 出力
		System.out.println(count);
	}
}