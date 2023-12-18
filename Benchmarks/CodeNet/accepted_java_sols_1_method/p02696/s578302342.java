import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int a = Integer.parseInt(scan.next());
      long b = Long.parseLong(scan.next());
      long n = Long.parseLong(scan.next());
      scan.close();
      
      long x = Math.min(b-1,n);
      System.out.println((a*x/b)-a*(x/b));
    }
}