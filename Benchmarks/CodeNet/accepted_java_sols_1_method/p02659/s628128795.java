import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    long a = Long.parseLong(input[0]);
    BigDecimal b = new BigDecimal(input[1]);
    BigDecimal answer = new BigDecimal(a).multiply(b);
    String wkAnswer = answer.toString();
    int idx = wkAnswer.indexOf('.');
    if(idx < 0){
      System.out.print(wkAnswer);
    } else {
      System.out.print(wkAnswer.substring(0, idx));
    }
  }
}