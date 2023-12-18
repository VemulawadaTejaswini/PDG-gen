import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String s = sc.next();
    StringBuilder day = new StringBuilder(s);
    day.setCharAt(3, '8');
    System.out.println(day);
  }
}
