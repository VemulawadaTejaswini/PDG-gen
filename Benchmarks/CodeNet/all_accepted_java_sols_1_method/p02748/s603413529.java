import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //a,b,mの入力
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    //クーポン入力の受け取り
    int x;
    int y;
    int z;
    //a.bの入力値受け取り
    int as[] = new int[a];
    int bs[] = new int[b];
    int ans; //結果
    int amin = 100000;//aの最小値
    int bmin = 100000;//bの最小値
    
    //a,bの入力及び最小値の算出
    for(int i = 0; i < a;i++) {
      as[i] = sc.nextInt();
      if(as[i] < amin) amin = as[i];
    }
    for(int i = 0; i < b;i++) {
      bs[i] = sc.nextInt();
      if(bs[i] < bmin) bmin = bs[i];
    }
    
    //クーポン無しでの最小値を初期値に
    
    ans = amin + bmin;
    
    //クーポンを使った場合を全て計算し、最小値を更新
    
   	for(int i = 0; i < m;i++){
      x = as[sc.nextInt()-1];
      y = bs[sc.nextInt()-1];
      z = x + y -sc.nextInt();
      
  	  if(z < ans) ans = z;
      	
    }
    
    //出力
    
    System.out.println(ans);
  }
}
