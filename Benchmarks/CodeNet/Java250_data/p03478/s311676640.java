import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int ans = 0;
    for(int i = 1; i <= N; i++){
      int sum = 0;
      String s = i + "";
      for(int j = 0; j < s.length(); j++){
        char c = s.charAt(j);
        sum += (c - '0');
      }
      if(sum >= A && sum <= B){
        ans += i;
      }
    }
    
    System.out.println(ans);
  }
}