import java.util.*;

public class Main{ 
  
  public static void main(String[] args) throws Exception{
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
     
    
    if(A>=1 && A<=100000 && B>=1 && B<=100000 && M>=1 && M<=100000){
    int[] aList = new int[A];
    int[] bList = new int[B];
    
    
    for(int i = 0; i < A; ++i){
      int next = sc.nextInt();
      if(next != 0){
       aList[i] = next;
      }
    }
    int MinA = aList[0];
    for(int i = 1; i < A; ++i){
      if(MinA >= aList[i]){
        MinA = aList[i];
      }
    }
    
    for(int i = 0; i < B; ++i){
      int next = sc.nextInt();
      if(next != 0){
      bList[i] = next;
      }
    }
    int MinB = bList[0];
    for(int i = 1; i < B; ++i){
      if(MinB >= bList[i]){
        MinB = bList[i];
      }
    }
    
    int AB = MinA + MinB;
    
    int a = 0;
    int b = 0;
    int c = 0;
    int answer = 0;
    for(int i = 0; i < M; ++i){
          a = sc.nextInt();
          if(a > A){
            throw new Exception("ダメです");
          }
      
          b = sc.nextInt();
          if(b > B){
            throw new Exception("ダメです");
          }
          int ans = aList[a-1] + bList[b-1];
          c = sc.nextInt();
          if(c > ans){
            throw new Exception("ダメです");
          }
         answer = ans - c;
         if(AB > answer){
            AB = answer;   
        } 
   }
    
    System.out.println(AB);
    }else{
       System.out.println("ダメです");
    }
  }
} 
