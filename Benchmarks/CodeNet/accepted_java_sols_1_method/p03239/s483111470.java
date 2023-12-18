import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] allList = new int[2*N];
    for(int i = 0; i < 2*N; i++){
      allList[i] = sc.nextInt();
    }
    int cost = 10001; 
    for(int i = 1; i < 2*N; i+=2){
      if(allList[i] <= T && allList[i-1]<cost){
        cost = allList[i-1];
      }
    }
    
    if(cost == 10001){
      System.out.println("TLE");
    }else{
      System.out.println(cost);
    }
    
  }
  
}