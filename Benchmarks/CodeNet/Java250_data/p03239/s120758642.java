import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
	  int N = sc.nextInt();
      int T = sc.nextInt();
      int[] A = new int[N*2]; 
      int min = 10001;
      int cost = 0;
      for(int i=0;i<2*N;i++){
       A[i] = sc.nextInt();
       if(i%2==1){//奇数はtのこと
         if(A[i]<=T){
           cost = A[i-1];
           min = Math.min(min,cost);
         }
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
