import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wakeup = sc.nextInt() * 60 + sc.nextInt();
    int sleep = sc.nextInt() * 60 + sc.nextInt();
    int studyTime = sc.nextInt();
    System.out.println(sleep - studyTime - wakeup);
  }
}
