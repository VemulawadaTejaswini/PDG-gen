import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    String b = sc.next();

    char[] c = b.toCharArray();

    int k = (c[0]-'0')*100 + (c[2]-'0')*10 + (c[3]-'0');

    System.out.println(a*k/100);

  }

}
