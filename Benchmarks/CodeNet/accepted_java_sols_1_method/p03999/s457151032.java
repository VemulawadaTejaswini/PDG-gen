import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int N = S.length();
    
    long sum = 0;
    for(int i = 0; i < 1<<(N-1); i++){
      int n = 0;
      for(int j = 0; j < N; j++){
        if((1 & i>>j) == 1){
          sum += Long.parseLong(S.substring(n, j+1));
          n = j+1;
        }
      }
      sum += Long.parseLong(S.substring(n, N));
    }
    System.out.println(sum);
  }
}