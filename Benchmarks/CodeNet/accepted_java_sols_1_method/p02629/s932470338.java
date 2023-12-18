import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    long n;
    n = scanner.nextLong();
   //System.out.println(n);
    while(n > 26) {
      int rem = (int) (n % 26);
      //System.out.println(rem);
      if(rem == 0)
        sb.append('z');
      else
        sb.append((char)('a' + rem - 1));
      //System.out.println(n%26);
      n = n / 26;
      if(rem == 0)
        n--;
    }
    sb.append((char)('a' + n -1));
    System.out.println(sb.reverse().toString());
  }
}