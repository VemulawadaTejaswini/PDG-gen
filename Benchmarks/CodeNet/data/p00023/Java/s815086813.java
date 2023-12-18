import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      double xa = sc.nextDouble();
      double ya = sc.nextDouble();
      double ra = sc.nextDouble();
      double xb = sc.nextDouble();
      double yb = sc.nextDouble();
      double rb = sc.nextDouble();

      double distance = Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));

      if(distance + rb < ra) {
        System.out.println("2");
      }
      else if(distance + ra < rb) {
        System.out.println("-2");
      }
      else if(distance - ra < rb) {
        System.out.println("1");
      }
      else {
        System.out.println("0");
      }
    }    
  }
}