import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int X = B % N;
    int goal = B - X;
    if (goal >= A && goal <= B) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }
}