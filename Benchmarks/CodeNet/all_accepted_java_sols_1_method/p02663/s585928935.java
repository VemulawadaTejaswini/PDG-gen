import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int k = sc.nextInt();    
    
    m2 -= k;
    while(m2 < 0) {
      m2 += 60;
      h2 -= 1;
    }
    
    int out = m2 - m1 + (h2-h1)*60;
    
    System.out.println(out);
  }
}