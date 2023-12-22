import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long k = scanner.nextLong();
    long r = n%k;
    
    long ans = Math.min(r, (k-r));
    System.out.println(ans);
    scanner.close();
  }

	
}
