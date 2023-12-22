import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> a = new HashMap<>();
    a.put(sc.next(),0);
    a.put(sc.next(),1);
    int[] b = new int[2];
    b[0] = sc.nextInt();
    b[1] = sc.nextInt();
    b[a.get(sc.next())] -= 1;
    System.out.println(b[0] + " " + b[1]);
  }
}