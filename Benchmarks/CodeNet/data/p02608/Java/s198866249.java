import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i=1; i<=n; i++) {
      int count=0;
      for (int x=1; x*x+2*x+2<=n; x++) {
        for (int y=1; y*y<=n-(x*x+2*x+2); y++) {
          for (int z=1; z*z+2*z+2<=n; z++){
            if (x*x+y*y+z*z+x*y+x*z+y*z == i) count++;
          }
        }
      }
      System.out.println(count);
    }
  }
}