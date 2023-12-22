import java.util.*;

public class Main{
  public static void main(String[] arts){
    Scanner scan = new Scanner(System.in);
    int p = scan.nextInt();
    int q = scan.nextInt();
    int r = scan.nextInt();
    
    int sum1 = p + q;
    int sum2 = p + r;
    int sum3 = q + r;
    
    if(sum1 <= sum2 && sum1 <= sum3){
      System.out.println(sum1);
    }else if(sum2 <= sum1 && sum2 <= sum3){
      System.out.println(sum2);
    }else{
      System.out.println(sum3);
    }
  }
}