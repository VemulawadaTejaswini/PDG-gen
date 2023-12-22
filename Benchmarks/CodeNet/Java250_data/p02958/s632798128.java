import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int check = 0;
    
    int[] P = new int[N];
    for(int i = 0; i < N; i++){
      P[i] = scanner.nextInt();
      
      if(P[i] != i+1){
        check++;
      }
    }
    
    //異なる箇所が なし もしくは 2か所 ならばYESとなる
    if(check == 0 || check == 2){
      System.out.println("YES");
    } else{
      System.out.println("NO");
    }
  }
}