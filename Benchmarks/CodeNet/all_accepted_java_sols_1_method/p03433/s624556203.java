import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    String ans = n%500<=a? "Yes":"No";
    System.out.println(ans);
  }
}

