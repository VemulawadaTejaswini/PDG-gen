import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    String[] T = sc.nextLine().split(" ");
    int G = Integer.parseInt(T[0]);
    int C = Integer.parseInt(T[1]);
    int P = Integer.parseInt(T[2]);
    
    String str = sc.nextLine();
    char[] c = str.toCharArray();
    long ans = 0;
    for(int i = 0; i < N; i++){
      if(i < K){
        if(c[i] == 'r'){
          ans += P;
        }else if(c[i] == 's'){
          ans += G;
        }else{
          ans += C;
        }
      }else{
        if(c[i] == 'r'){
          if(c[i] != c[i-K]){
            ans += P;
          }else{
            c[i] = 'a';
          }
        }else if(c[i] == 's'){
          if(c[i] != c[i-K]){
            ans += G;
          }else{
            c[i] = 'a';
          }
        }else{
          if(c[i] != c[i-K]){
            ans += C;
          }else{
            c[i] = 'a';
          }
        }
      }
    }
    System.out.println(ans);
  }
}