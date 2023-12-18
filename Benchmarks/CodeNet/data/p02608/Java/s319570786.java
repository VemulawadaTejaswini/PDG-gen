import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    var N = Integer.parseInt(str);
    int ans[] = new int[10000];
    double x,y,z;
    int a;
    double b;

    for (x = 1; x <= 100; x++){
      for (y = 1; y <= 100; y++){
        for (z = 1; z <= 100; z++){
           b = Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+(x*y)+(y*z)+(z*x);
           if( (int)b < 10000 ){
      	     ans[(int)b]++;
           }
        }
      }
    }

    for (var i = 0;i < N;i++) {
      System.out.println(ans[i]);
    }

    scan.close();
  }
}