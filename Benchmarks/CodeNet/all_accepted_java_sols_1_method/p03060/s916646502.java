import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int n = sc.nextInt();//宝石数
      
      //配列
      int value[] = new int[n];
      int cost[]  = new int[n];
      
      int truth =0;
      int max =0;
      
      //宝石の価値の配列作成
      for(int i=0; i<n; i++){
        value[i] = sc.nextInt();
      }
      
      //コストの配列作成  
      for(int i=0; i<n; i++){
        cost[i]  = sc.nextInt();
      }   
     
      for(int i=0; i<n; i++){
       //価値からコストを引くことで「真の価値」を求める
      	if(value[i]>=cost[i] && cost[i]>=0){
          truth = value[i] - cost[i];
          max += truth;   
        }
      }
      System.out.println(max);
    }
}