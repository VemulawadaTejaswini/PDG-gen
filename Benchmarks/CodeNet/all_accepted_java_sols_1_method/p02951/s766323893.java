import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    sc.close();

    int a = A - B;

    int ans = 0;

    if (0 < C-a){
      ans = C - a;
    }

    System.out.println(ans);
    
  }

}