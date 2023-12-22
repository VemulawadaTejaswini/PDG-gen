import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    int[] m = new int[12+1];
    m[1] = 1;
    m[3] = 1;
    m[5] = 1;
    m[7] = 1;
    m[8] = 1;
    m[10] = 1;
    m[12] = 1;
    
    m[4] = 2;
    m[6] = 2;
    m[9] = 2;
    m[11] = 2;
    
    m[2] = 3;
    
    System.out.println(m[x] == m[y] ? "Yes" : "No");
  }
}