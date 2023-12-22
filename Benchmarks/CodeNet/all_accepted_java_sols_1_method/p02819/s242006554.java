import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    boolean[] prime = new boolean[200001];
    for(int i = 2; i < 200001; i++) {
      prime[i] = true;
    }
    prime[1] = false;
    for(int i = 2; i < 200001; i++) {
      if(prime[i]) {
        for(int j = (2 * i); j < 200001; j += i) {
          prime[j] = false;
        }
      } 
    }
    int ans = 0;
    for(int i = 2; i < 200001; i++) {
      if((prime[i]) && (i >= x)) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}
