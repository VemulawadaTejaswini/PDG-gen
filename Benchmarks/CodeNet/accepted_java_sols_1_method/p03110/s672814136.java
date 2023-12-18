import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double prices[]=new double[N];
     double sum=0;
    String currency[]=new String[N];
    for (int i = 0; i < N; i++) {
      prices[i] = sc.nextDouble();
      currency[i] = sc.next();
    }
    for (int i = 0; i < N; i++) {
      if(currency[i].equals("BTC")){
        sum +=prices[i]*380000;
      }else{
        sum +=prices[i];
      }
    }System.out.println(sum);
  }
}