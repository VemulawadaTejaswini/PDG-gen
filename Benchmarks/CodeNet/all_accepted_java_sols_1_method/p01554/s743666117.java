import java.util.*;

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String list[] = new String[n];
    for (int i = 0; i < n; i++)
      list[i] = sc.next();
    int m = sc.nextInt();
    int flag = 0;
    for (int i = 0; i < m; i++) {
      String s = sc.next();
      for (int j = 0; j < n; j++) {
        if (s.equals(list[j])) {
          if (flag % 2 == 0)
            System.out.println("Opened by " + s);
          else
            System.out.println("Closed by " + s);
          flag++;
          break;
        }
        else if (j == n - 1)
          System.out.println("Unknown " + s);
      }
    }
  }
}

