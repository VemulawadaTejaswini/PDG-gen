import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] points = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
    String forWin = "spr";
    sc.nextLine();
    String t = sc.nextLine();
    int ans = 0;
    
    for(int i = 0; i < k; i++){
      int cnt = 1;
      for(int j = i; j < n; j += k){
        char cur = t.charAt(j);
        
        if(j + k < n && cur == t.charAt(j + k)){
          cnt++;
        }else{
          ans += points[forWin.indexOf(cur)] * (cnt / 2 + cnt % 2);
          cnt = 1;
        }
      }
    }
    
    System.out.println(ans);
  }
}