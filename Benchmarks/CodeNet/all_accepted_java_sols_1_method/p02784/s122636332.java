import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt(), N = sc.nextInt(), t=0;
    for(int i=0; i<N; i++) {
    t+=sc.nextInt();
    }
    if(H<=t) System.out.println("Yes");
    else System.out.println("No");
  }
}