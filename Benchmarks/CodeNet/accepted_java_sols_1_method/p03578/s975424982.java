import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      if(map.get(n) == null){
        map.put(n, 1);
      }else{
        map.put(n, map.get(n)+1);
      }
    }
    
    int M = Integer.parseInt(sc.nextLine());
    String[] T = sc.nextLine().split(" ");
    String ans = "YES";
    for(int i = 0; i < M; i++){
      int m = Integer.parseInt(T[i]);
      if(map.get(m) == null){
        ans = "NO";
        break;
      }else{
        if(map.get(m) == 0){
          ans = "NO";
          break;
        }else{
          map.put(m, map.get(m)-1);
        }
      }
    }
    System.out.println(ans);
  }
}