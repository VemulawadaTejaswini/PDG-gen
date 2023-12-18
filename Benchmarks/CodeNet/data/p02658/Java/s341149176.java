import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = sc.nextLong();
    for (int i = 0; i < N-1; i++) ans *= sc.nextLong();
    if (ans > (long)Math.pow(10,18)) ans = -1; 
    System.out.println(ans);
  }
}