import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();

    long c = a%b;
    if (b-c > c){
      System.out.println(c);
    }
    else{
      System.out.println(b-c);
    }
  }
}
