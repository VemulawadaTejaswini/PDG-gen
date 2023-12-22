import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int H1 = Integer.parseInt(sc.next());
    int M1 = Integer.parseInt(sc.next());
    int H2 = Integer.parseInt(sc.next());
    int M2 = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    if(H1 >= 0 && H1 <= 23 && H2 >= 0 && H2 <= 23 &&
       M1 >= 0 && M1 <= 59 && M2 >= 0 && M2 <= 59 && K >= 1){
      
      int ans = M2 + (H2 - H1)*60 - M1 -K;
      System.out.println(ans);
      
    }else{
      System.out.println("入力条件に違反しています");
    }
    
    
  }
  
}