import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int T = sc.nextInt();
    int c[] = new int[n];
    int t[] = new int[n];
    int answer =100000000;
    for(int i=0;i<n;i++){
      c[i]=sc.nextInt();
      t[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(t[i]<=T){
        answer = Math.min(answer,c[i]);
      }
    }
    if(answer!=100000000){
      System.out.println(answer);
    }else{
      System.out.println("TLE");
    }
        
      
  }
  

  
}