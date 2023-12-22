import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, one, five, ten, value;
    boolean flag = true;
    number = Integer.parseInt(sc.next());
    value = Integer.parseInt(sc.next());
    for(ten = 0; ten <= number; ten++) {
      for(five = 0; five <= number - ten; five++) {
        one = number - ten - five;
        if(one * 1000 + five * 5000 + ten * 10000 == value) {
          flag = false;
          System.out.println(ten + " " + five + " " + one);
          return;
        }
      }
    }
    if(flag) System.out.println("-1 -1 -1");
  }
}
