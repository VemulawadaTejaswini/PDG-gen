import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();
    double ans = 1;
    for(long i = 0; i < N; i++){
      ans = (ans*(i+1))%(Math.pow(10,9)+7);
    }
    System.out.println((int)ans);
  }
}
