import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int m = sc.nextInt(); // mideterm
      int e = sc.nextInt(); // endterm?
      int me = m + e;
      int r = sc.nextInt();  // retest
      if (m == -1 && e == -1 && r == -1)
        break;
      else if (m == -1 || e == -1){
        System.out.println('F');
        continue;
      }
      else if (me >= 80){
        System.out.println('A');
        continue;
      }
      else if (65 <= me && me < 80){
        System.out.println('B');
        continue;
      }
      else if (50 <= me && me < 65){
        System.out.println('C');
        continue;
      }
      else if (30 <= me && me < 50){
        if (r >= 50) System.out.println('C');
        else System.out.println('D');
        continue;
      }
      else if (me <= 30){
        System.out.println('F');
        continue;
      }
    }
  }
}