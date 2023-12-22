import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int sumA = 0;
    
    for(int i=0; i<M; i++){
      sumA += sc.nextInt();
    }
    
    if(sumA > N){
      System.out.print("-1");
    }else if(sumA == N){
      System.out.print("0");
    }else{
      System.out.print(N - sumA);
    }
    
  }
}