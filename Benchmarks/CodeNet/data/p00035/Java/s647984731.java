import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String line = sc.nextLine();
      String[] a = line.split(",");
      float xa = Float.valueOf(a[0]);
      float ya = Float.valueOf(a[1]);
      float xb = Float.valueOf(a[2]);
      float yb = Float.valueOf(a[3]);
      float xc = Float.valueOf(a[4]);
      float yc = Float.valueOf(a[5]);
      float xd = Float.valueOf(a[6]);
      float yd = Float.valueOf(a[7]);
      int flag;
      if((xb-xa)*(yd-ya)-(xd-xa)*(yb-ya)>0) {
        flag=1;
      }
      else {
        flag=0;
      }

      if(((xc-xb)*(ya-yb)-(xa-xb)*(yc-yb))*flag<0) {
        System.out.println("YES");
      }
      else if(((xd-xc)*(yb-yc)-(xb-xc)*(yd-yc))*flag<0) {
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