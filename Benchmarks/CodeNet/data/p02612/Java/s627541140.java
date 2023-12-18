import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int price = sc.nextInt();
    String charge = Integer.toString(10000 - price);
    int len = charge.length();

    if (len > 3){
      charge = charge.substring(1);
    }
    if (charge.equals("000")) charge = "0";

    System.out.println(charge);
  }
}
