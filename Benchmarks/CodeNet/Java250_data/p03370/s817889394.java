import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();    
    int total = 0, min =1000;
    for (int i=0; i<N; i++) {
      int m = sc.nextInt();
      X -= m;
      min = Math.min(m,min);
      total++;
    } 
    System.out.println(total + X / min); 
  }
}