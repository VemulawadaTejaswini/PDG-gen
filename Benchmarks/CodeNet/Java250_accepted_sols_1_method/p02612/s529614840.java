import java.util.*;
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<=N; i++){
          int ans = 1000*i - N;
          if (ans >= 0){
            System.out.println(ans);
            break;
          } else if (ans < 0) {
            continue;
          }
        }
    }
  }