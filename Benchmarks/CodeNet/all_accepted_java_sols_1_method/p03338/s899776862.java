import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    String s = sc.next();
    
    int ans = 0;
    for(int i = 1; i <= x ; i++){
      int count = 0;
      for(char c = 'a' ; c <= 'z'; c++){
        if(s.substring(0,i).contains(String.valueOf(c)) && s.substring(i).contains(String.valueOf(c))){
          count++;
        }
      }
      ans = Math.max(count,ans);
    }
    System.out.println(ans);
  }
}
        