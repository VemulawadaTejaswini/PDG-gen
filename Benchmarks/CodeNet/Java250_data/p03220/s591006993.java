import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    double minDif = Double.MAX_VALUE;
    int minPoint = 0;
    for (int i = 0;i < n;i ++) {
      int h=sc.nextInt();
      double averageT = t - (h * 0.006);
      double dif = Math.abs(a - averageT);
      if (dif < minDif) {
        minDif=dif;
        minPoint=i;
      }
    }
    System.out.println(minPoint+1);
  }
}