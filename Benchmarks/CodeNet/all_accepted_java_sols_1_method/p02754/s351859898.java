import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    Long A = sc.nextLong();
    long B = sc.nextLong();
    long x = N/(A+B);
    long y = N%(A+B);
    if(y==0){
      System.out.println(x*A);
    }else{
      if(A>=y){
        System.out.println((x*A)+y);
      }else{
        System.out.println((x*A)+A);
      }
    }

  }
}
