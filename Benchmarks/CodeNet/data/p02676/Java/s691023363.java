import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
	String s = sc.next();
    String x = "";

    if (s.length() <= k) {
      x = s;
    } else {
      x = s.substring(0,k);
      x = x + "...";
    }

    System.out.println(x);
  }
}
