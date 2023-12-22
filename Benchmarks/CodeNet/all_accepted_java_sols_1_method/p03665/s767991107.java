import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int P = Integer.parseInt(S[1]);
    boolean flag = false;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n%2 == 1){
        flag = true;
        break;
      }
    }
    
    long ans = 0;
    if(flag){
      ans = (long)Math.pow(2, N-1);
    }else{
      if(P == 1){
        ans = 0;
      }else{
        ans = (long)Math.pow(2, N);
      }
    }
    System.out.println(ans);
  }
}