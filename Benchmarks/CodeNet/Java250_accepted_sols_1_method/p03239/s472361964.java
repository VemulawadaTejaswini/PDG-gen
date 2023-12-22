import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    
    int date[] = new int[n*2];
    int cost = 1001;
    
    for(int i = 0 ; i < n*2 ; ++i){
      date[i] = sc.nextInt();
    }
    
    for(int i = 1;i<n*2;i+=2){
      if(date[i] <= t && date[i-1]<cost){
        cost = date[i-1];
      }
    }
    
    if(cost == 1001){
      System.out.println("TLE");
    }else{
      System.out.println(cost);
    }  
  }
}