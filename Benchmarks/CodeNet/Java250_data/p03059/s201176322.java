import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int T = sc.nextInt();

    sc.close();
    
    int a = T / A;

    System.out.println(a * B);

  }

}