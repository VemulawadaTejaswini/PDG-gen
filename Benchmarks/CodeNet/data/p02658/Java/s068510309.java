import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();

    long sum = 1;
    for (int i=0;i<a;i++){
      long b = scan.nextInt();
      if (b==0){
        System.out.println("0");
        return;
      }
      sum*=b;
    }
    long limit = (long) Math.pow(10,18);
    if (sum>limit){
      System.out.println("-1");
      return;
    }
    System.out.println(sum);
  }
}
