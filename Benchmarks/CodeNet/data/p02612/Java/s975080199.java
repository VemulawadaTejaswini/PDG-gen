import java.util.*;
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0; 
        int ans = 1000*i-N;
        while(i<N){
          if(ans >= 0){
            ans = 1000*i - N;
            break;
          } else if (ans < 0){
            continue;
          }
          i++;
        }
        System.out.println(ans);
    }
  }