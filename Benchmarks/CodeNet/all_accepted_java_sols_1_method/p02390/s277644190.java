import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int h = a / 3600;
    int m = (a - h * 3600) / 60;
    int s = a - h * 3600 - m * 60;
    System.out.println(h + ":" + m + ":" + s);
  }
}

