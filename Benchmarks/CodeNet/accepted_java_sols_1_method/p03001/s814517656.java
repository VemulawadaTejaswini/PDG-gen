import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    long d = scan.nextLong();
    double size = (double) a*b/2;
    if ((c*2 == a)&&(d*2 == b)){
      System.out.println(size +" "+ 1);
    }
    else{
      System.out.println(size +" "+ 0);
    }
  }
}
