import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//ルートの数　ループ回数になる
		int N = sc.nextInt();

    // 基準となる時間
    int firstT = sc.nextInt();

    int printCost = 1001;

    for(int i =0; i < N; i++){
      //コスト
  		int c = sc.nextInt();
      // そのルートの時間
      int t = sc.nextInt();
      if( firstT >= t ){
        if(printCost > c ){
          printCost = c;
        }
      }
    }
    if(printCost == 1001){
      System.out.println("TLE");
    }
    else {
  		System.out.println(printCost);
    }
	}
}