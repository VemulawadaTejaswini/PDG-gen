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
      double dist = Math.sqrt(Math.pow(xa-xb, 2) + Math.pow(ya-yb, 2));
      if(ra > rb && dist < ra - rb) {
        System.out.println(2);
      }
      else if(rb > ra && dist < rb - ra) {
	System.out.println(-2);
      }
      else if(dist <= ra + rb && dist >= ra - rb) {
	System.out.println(1);
      }
      else {
        System.out.println(0);
      }
    }    
  }
}