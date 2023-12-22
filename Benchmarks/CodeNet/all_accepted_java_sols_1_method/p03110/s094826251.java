import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long sum = 0;
    double btc = 0;
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      double tmp = sc.nextDouble();
      String str = sc.next();
      if(str.equals("JPY")){
        sum += (long)(tmp);
      }else{
        btc += tmp;
      }
    }
    System.out.println(btc * 380000.0 + sum);
  }
}