import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cycle, number_of_biscuits, time;
    cycle = Integer.parseInt(sc.next());
    number_of_biscuits = Integer.parseInt(sc.next());
    time = Integer.parseInt(sc.next());
    System.out.println(time / cycle * number_of_biscuits);
  }
}
