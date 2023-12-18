import java.util.*;

public class Main {  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    double b = in.nextDouble()*100;
    System.out.print((long)(a*b/100));
  }
}