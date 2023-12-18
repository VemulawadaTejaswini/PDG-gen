import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      if(n==-1) {
        break;
      }

      double x = Math.cos(0);
      double y = Math.sin(0);
      double r  = Math.PI / 2;

      for(int i=1; i<n; i++) {
        x += Math.cos(r);
        y += Math.sin(r);
        r -= Math.PI / 2 - Math.asin(1 / Math.sqrt(i + 1));
        r += Math.PI / 2;
      }
      System.out.println(x);
      System.out.println(y);
    }
  }
}