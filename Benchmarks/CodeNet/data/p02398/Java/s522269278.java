import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, bottom, top, number, count = 0;
    bottom = Integer.parseInt(sc.next());
    top = Integer.parseInt(sc.next());
    number = Integer.parseInt(sc.next());
    for(i = bottom; i <= top; i++) {
      if(number % i == 0) count++;
    }
    System.out.println(count);
  }
}
