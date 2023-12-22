import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      float x1 = sc.nextFloat();
      float y1 = sc.nextFloat();
      float x2 = sc.nextFloat();
      float y2 = sc.nextFloat();
      float m1 = (y2-y1)/(x2-x1);
      x1 = sc.nextFloat();
      y1 = sc.nextFloat();
      x2 = sc.nextFloat();
      y2 = sc.nextFloat();
      float m2 = (y2-y1)/(x2-x1);
      if(m1==m2) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}