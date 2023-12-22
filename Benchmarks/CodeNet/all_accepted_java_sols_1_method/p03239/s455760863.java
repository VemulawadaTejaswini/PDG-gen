import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
	  int N = sc.nextInt();
      int T = sc.nextInt();
      int min = 10001;
      
      for(int i=0;i<N;i++){
       int cost = sc.nextInt();
        if(sc.nextInt()<=T){
          min = Math.min(min,cost);
        }
      }
      //出力
      if(min==10001){
        System.out.println("TLE");
      }else{
        System.out.println(min);
      }
    }
}