import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int back;
    if (N % 1000 == 0) {
      back = 0;
    }else {
      back = 1000 - (N % 1000);
    }
    System.out.println(back);
  }
}