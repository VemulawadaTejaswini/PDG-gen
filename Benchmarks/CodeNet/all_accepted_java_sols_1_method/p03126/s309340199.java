import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    if(N == 1){
      int count1 = 0;
      int K1 = sc.nextInt();
      for(int i = 0; i < K1 ; i++){
        int love = sc.nextInt();
        if(love <= M){
          count1++;
        }
      }
      
      System.out.println(count1);
      
    }else{
    
    ArrayList<Integer> love = new ArrayList<Integer>();
    for(int i = 0; i < N ; i++){
      int K = sc.nextInt();
      int[] list = new int[K];
       for(int j = 0; j < K ; j++){
         list[j] = sc.nextInt();
         love.add(list[j]);
       }   
    }
      
    Collections.sort(love);
 
    ArrayList<Integer> countAll = new ArrayList<Integer>();
    int count = 0;
    for(int i = 1; i <= M  ; i++){
      for(int j = 0; j < love.size(); j++){
        int jd = love.get(j);
        if(jd == i){
          count = count + 1;
        }
      }
      countAll.add(count);
      count = 0;
    }
      
    int lastCount = 0;
    for(int i = 0; i < countAll.size() ; i++){
      if(countAll.get(i) == N){
        lastCount++;
      }
    }
    System.out.println(lastCount);   
    }
  }  
}