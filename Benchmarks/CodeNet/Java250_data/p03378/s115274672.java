import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt()+1;  //道のり
    int M = sc.nextInt();    //料金所の数
    int X = sc.nextInt();    //スタート地点
    int[] place = new int[M]; //料金所の場所
    
    int PatternA = 0;
    int PatternB = 0;
    
    for(int i = 0 ; i < M ; i++){
      place[i] = sc.nextInt();
    }
    
    for(int i = X ; i < N ; i++){ //右側の料金所の数
      for(int j = 0 ; j < place.length ; j++){
        if(i == place[j]){
          PatternA++;
        }
      }
    }
    
    for(int i = X ; i >= 1 ; i--){
      for(int j = 0 ; j < place.length ; j ++){
        if(i == place[j]){
        PatternB++;
        }
      }
    }
    if(PatternA < PatternB){
      System.out.println(PatternA);
    }else{
      System.out.println(PatternB);
    }
  }
}