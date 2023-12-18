import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String[] v = sc.nextLine().split(" ");
      double xa1 = Double.valueOf(v[0]);
      double ya1 = Double.valueOf(v[1]);
      double xa2 = Double.valueOf(v[2]);
      double ya2 = Double.valueOf(v[3]);
      double xb1 = Double.valueOf(v[4]);
      double yb1 = Double.valueOf(v[5]);
      double xb2 = Double.valueOf(v[6]);
      double yb2 = Double.valueOf(v[7]);
      if(yb1<=ya2 && ya1<=yb2 && xb1<=xa2 && xa1<=xb2) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}