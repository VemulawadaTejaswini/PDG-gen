import java.util.*;
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double D = sc.nextDouble();
        int cnt = 0;
        double[] X = new double[N];
        double[] Y = new double[N];
        for(int i=0; i<N; i++){
          X[i] = sc.nextDouble();
          Y[i] = sc.nextDouble();
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