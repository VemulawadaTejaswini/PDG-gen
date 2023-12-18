import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String line = sc.nextLine();
      String[] a = line.split(",");
      double xa = Double.valueOf(a[0]);
      double ya = Double.valueOf(a[1]);
      double xb = Double.valueOf(a[2]);
      double yb = Double.valueOf(a[3]);
      double xc = Double.valueOf(a[4]);
      double yc = Double.valueOf(a[5]);
      double xd = Double.valueOf(a[6]);
      double yd = Double.valueOf(a[7]);
      int flag;
      if((xb-xa)*(yd-ya)-(xd-xa)*(yb-ya)>0) {
        flag=1;
      }
      else {
        flag=0;
      }

      if(((xd-xc)*(yb-yc)-(xb-xc)*(yd-yc))*flag<0) {
        System.out.println("NO");
      }
      else if(((xa-xd)*(yc-yd)-(xc-xd)*(ya-yd))*flag<0) {
        System.out.println("NO");
      }
      else {
        System.out.println("YES");
      }
    }
  }
}