import java.util.*;
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int cnt = 0;
        int[] X = new int[N];
        int[] Y = new int[N];
        for(int i=0; i<N; i++){
          X[i] = sc.nextInt();
          Y[i] = sc.nextInt();
          double d = Math.sqrt(X[i]*X[i]+Y[i]*Y[i]);
          if(d<=D){
            cnt++;
          } else if(N==0 || d>D){
            continue;
          }
        }
      System.out.println(cnt);
    }
  }