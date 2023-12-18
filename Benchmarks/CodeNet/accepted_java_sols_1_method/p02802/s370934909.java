import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    boolean[] check = new boolean[N];
    int[] sum_wa = new int[N];
    int ac = 0, wa = 0;
    for(int i = 0; i < M; i++){
      String[] T = sc.nextLine().split(" ");
      int A = Integer.parseInt(T[0])-1;
      if(!check[A]){
        if(T[1].equals("WA")){
          sum_wa[A]++;
        }else{
          check[A]= true;
        }
      }
    }
    for(int i = 0; i < N; i++){
      if(check[i]){
        ac++;
        wa += sum_wa[i];
      }
    }
    System.out.println(ac+" "+wa);
  }
}