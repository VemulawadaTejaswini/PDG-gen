import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer num[] = new Integer[3];
    num[0] = sc.nextInt();
    num[1] = sc.nextInt();
    num[2] = sc.nextInt();
    Arrays.sort(num, Collections.reverseOrder());
    System.out.println(Math.abs(num[0]-num[1])+Math.abs(num[2]-num[1]));
  }
}