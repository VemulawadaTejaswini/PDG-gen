import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double g = 9.8;
    while (sc.hasNext()) {
      double vMin = sc.nextDouble();
      double t = vMin/g;
      double y = 0.5*g*t*t;
      for (int i = 0; ; i++) {
        if (5*i-5 > y) {
          System.out.println(i);
          break;
        }
      }
    }
  }
}