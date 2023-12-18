import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String A = sc.nextLine();
    String B = sc.nextLine();
    String C = sc.nextLine();
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      char a = A.charAt(i);
      char b = B.charAt(i);
      char c = C.charAt(i);
      if(a == b && a == c){
      }else if(a == b || b == c || a == c){
        ans++;
      }else{
        ans += 2;
      }
    }
    System.out.println(ans);
  }
}