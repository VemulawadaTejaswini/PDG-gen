import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String crlf = System.getProperty("line.separator");
    int m, f, r;
    
    while(in.hasNext()) {
      m = in.nextInt();
      f = in.nextInt();
      r = in.nextInt();
      if (m == -1 && f == -1 && r == -1) return;
      int sum = m + f;
      
      if      ((m == -1 || f == -1) || (sum < 30)) System.out.println("F");
      else if (sum >= 80)                          System.out.println("A");
      else if (sum >= 65 && sum < 80)              System.out.println("B");
      else if (sum >= 50 && sum < 65)              System.out.println("C");
      else if (r >= 50)                            System.out.println("C");
      else                                         System.out.println("D");
    }
  }
}