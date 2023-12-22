import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int B[] = new int[M];
    int A[][] = new int[N][M];
    int answer =0;
    for(int i=0;i<M;i++){
      B[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        A[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0;i<N;i++){
      int sum=0;
      for(int j=0;j<M;j++){
        sum = sum+A[i][j]*B[j];
      }
      if(sum+C>0){
        answer=answer+1;
      }
    }
    System.out.println(answer);
      
      
      
      
      
      
    
    
  }
  

  
}