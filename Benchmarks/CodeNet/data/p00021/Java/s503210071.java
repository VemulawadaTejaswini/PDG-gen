
import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Vector<Double> vec = new Vector<Double>();
    while(sc.hasNextDouble()){
      double x1 = sc.nextDouble();
      double y1 = sc.nextDouble();

      double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();

      double x3 = sc.nextDouble();
      double y3 = sc.nextDouble();

      double x4 = sc.nextDouble();
      double y4 = sc.nextDouble();

      double coefAB = (y1-y2)/(x1-x2);
      double coefCD = (y3-y4)/(x3-x4);

      if ( coefAB == coefCD ){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }

    }
  }
}