import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double k = sc.nextDouble();
    double answer = 0;
    for(double i=1;i<=n;i++){
      double coinCnt =0;
      coinCnt=Math.ceil((Math.log(k)/Math.log(2))-(Math.log(i)/Math.log(2)));
      if(coinCnt<=0){
        coinCnt=0;
      }
      answer += 1/Math.pow(2,coinCnt);
    }
    System.out.println(answer*(1/n));
  }
}