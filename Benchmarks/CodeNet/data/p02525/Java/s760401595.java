
import java.util.Scanner;

class StanDev{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true) {
      int n = sc.nextInt();
      if (n == 0 &&/* n>= 1000*/) {
        break;
      }

      int point[] = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        point[i] = sc.nextInt();
        sum += point[i];
      }

      double ave = (double)sum/n;
      double sdsum = 0;
      for (int i = 0; i < n; i++) {
        sdsum += Math.pow((point[i]-ave),2);
      }

      System.out.println(Math.sqrt(sdsum/n));
    }
  }
}