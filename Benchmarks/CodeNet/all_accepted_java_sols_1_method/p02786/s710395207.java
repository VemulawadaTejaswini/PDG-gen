import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long count = 0;
    while (true) {
      if (Math.pow(2,count) > H) break;
      count++;
    }
    System.out.println((long)Math.pow(2,count) -1);
  }
}