import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    String s1 = s.substring(0,1);
    String s2 = s.substring(1,2);
    String s3 = s.substring(2,3);

    int count = 0;

    if (s1.equals("1")) {
      count++;
    }

    if (s2.equals("1")) {
      count++;
    }

    if (s3.equals("1")) {
      count++;
    }

    System.out.println(count);

  }
}