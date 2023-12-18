import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int big = n;
    int small = m;
    
    if (n<m) {
      big = m;
      small = n;
    }
    
    String result = "";
    for (int i = 0; i<big; i++) {
      result += String.valueOf(small);
    }
    
    System.out.println(result);
    
  }
}