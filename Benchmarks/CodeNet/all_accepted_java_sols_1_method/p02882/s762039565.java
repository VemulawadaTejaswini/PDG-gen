import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();

    double aab_x =  a*a*b -x;

    double ans =0;
    if(aab_x!=0){
      double c =  2.0d * aab_x / (double)(a*a);

      if(c>b){
        c = (double)x*2.0d / ((double) a * b);
        ans = Math.toDegrees(Math.atan( ((double)b/c)));
      }else{
        ans = Math.toDegrees(( Math.atan( c /a )));
      }


    }
    System.out.println(ans);
  }

}