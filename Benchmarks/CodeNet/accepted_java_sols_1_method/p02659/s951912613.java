import java.util.*;

public class Main {  
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    int b = (int)(in.nextDouble()*100+0.01);
    System.out.print((a*b)/100);
  }
}
