import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long N = sc.nextLong(), w=(long)Math.sqrt(N), t, min=N+1;
    for(int i=1; i<=w; i++) {
      if(N % i ==0) {
        t = i + N/i;
        if(t<min) min = t;
      }
    }
    System.out.println(min-2);
  }
}