import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int hour = sc.nextInt();
      int minute = sc.nextInt();
      int H = sc.nextInt();
      int M = sc.nextInt();
      double Hrad = (30 * H) + (0.5 * M) ;
//      System.out.println(Hrad);
      double Mrad = 6 * M ;
//      System.out.println(Mrad);
      double cos;
      if(Hrad >= Mrad) {
        cos = Math.cos(Math.toRadians(Hrad - Mrad));
      } else {
        cos = Math.cos(Math.toRadians(Mrad - Hrad));
      }
      double a2 = (hour * hour) + (minute * minute) -(2 * hour * minute * cos);
      double ans = Math.sqrt(a2);
      System.out.println(ans);
    } 
}