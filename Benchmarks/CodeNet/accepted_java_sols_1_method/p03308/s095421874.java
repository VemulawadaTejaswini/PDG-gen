import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = a;
    int m;
    for (int i = 0;i<n-1;i++) {
      m = sc.nextInt();
      if (m<a) a=m;
      if (b<m) b=m;
    }
    System.out.println(b-a);
  }
}
