import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    
    int count = 0;
    for(int i = 1; i <= n; i++) {
      int len = String.valueOf(i).length();
      if(len % 2 == 1) count++;
    }
    System.out.println(count);
  }
}