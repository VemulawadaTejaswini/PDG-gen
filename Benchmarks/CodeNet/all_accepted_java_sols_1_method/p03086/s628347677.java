import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] T = sc.next().toCharArray();
    int ans = 0;
    int now = 0;
    char[] atcg = {'A', 'T', 'C', 'G'};
    for(int i = 0; i < T.length; i++){
      boolean isATCG = false;
      for(int j = 0; j < atcg.length; j++) {
        if(T[i] == atcg[j]) {
          isATCG = true;
        }
      }
      if(!isATCG) {
        now = 0;
      }else {
        now++;
        ans = Math.max(ans, now);
      }
    }
    System.out.println(ans);
  }
}
        
        
