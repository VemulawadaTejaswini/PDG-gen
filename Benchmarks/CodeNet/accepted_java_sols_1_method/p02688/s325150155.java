import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int[] val = new int[N];
    for(int i = 0; i < K; i++){
      int A = Integer.parseInt(sc.nextLine());
      S = sc.nextLine().split(" ");
      for(int j = 0; j < A; j++){
        int b = Integer.parseInt(S[j])-1;
        val[b]++;
      }
    }
    int ans = 0;
    for(int c : val){
      if(c == 0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}