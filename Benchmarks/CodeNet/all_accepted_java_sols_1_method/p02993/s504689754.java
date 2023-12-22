import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      String S = sc.next();
      char[] p = S.toCharArray();

  System.out.print(p[0]==p[1]||p[1]==p[2]||p[2]==p[3]?"Bad":"Good");

    }
}