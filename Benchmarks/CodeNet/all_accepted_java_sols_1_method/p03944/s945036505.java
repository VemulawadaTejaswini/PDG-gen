import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int W = Integer.parseInt(S[0]);
    int H = Integer.parseInt(S[1]);
    int N = Integer.parseInt(S[2]);
    
    int ax = 0;
    int ay = 0;
    int bx = W;
    int by = H;
    
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      int x = Integer.parseInt(T[0]);
      int y = Integer.parseInt(T[1]);
      int order = Integer.parseInt(T[2]);
      
      if(order == 1 && x > ax){
        ax = x;
      }else if(order == 2 && x < bx){
        bx = x;
      }else if(order == 3 && y > ay){
        ay = y;
      }else if(order == 4 && y < by){
        by = y;
      }
    }
    int ans = Math.max(0, (bx - ax)) * Math.max(0, (by - ay));
    
    System.out.println(ans);
  }
}