import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N = sc.nextInt();
      double[] A = new double[N];
      double ans = 1;
      long max = (long) Math.pow(10,18);
      for(int i = 0 ; i < N; i++) ans *= sc.nextDouble();
      if(ans > max){
        System.out.println("-1");
      } else {
        System.out.println((long)ans);
      }
    } 
}