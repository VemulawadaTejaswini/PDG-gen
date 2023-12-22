import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String answer = "YES";

    if (a > c || a + b < c) {
      answer = "NO";
    }

    System.out.println(answer);
  }
}
