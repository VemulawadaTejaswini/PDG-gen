import.java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    
    int seven = 7;
    int ans = -1;
    
    for(int i = 1; i <= K; ++i) {
      seven %= K;
      if(seven == 0) {
        ans = i;
        break;
      }
      seven = seven * 10 + 7;
    }
    System.out.println(ans);
  }
}