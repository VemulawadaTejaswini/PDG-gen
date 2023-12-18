import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String[] v = sc.nextLine().split(" ");
      double xa = Double.valueOf(v[0]);
      double ya = Double.valueOf(v[1]);
      double xb = Double.valueOf(v[2]);
      double yb = Double.valueOf(v[3]);
      double xc = Double.valueOf(v[4]);
      double yc = Double.valueOf(v[5]);
      double xd = Double.valueOf(v[6]);
      double yd = Double.valueOf(v[7]);
      if(((ya-yb)*(yc-yd))/((xa-xb)*(xc-xd))==-1 || ((ya-yb)==0 && (xc-xd)==0) || ((xa-xb)==0 && (yc-yd)==0)) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}