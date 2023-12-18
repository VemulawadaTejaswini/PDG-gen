import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true) {
      int n = sc.nextInt();
      int point[] = new int[n];
      int sum = 0;
      for (i = 0; i < n; i++) {
        if (n == 0) {
          break;
        }
        point[i] = sc.nextInt();
        sum += point[i];
      }
      double ave = (double)sum/n;
      double sdsum = 0;
      for (i = 0; i < n; i++) {
        sdsum += Math.pow((point[i]-ave),2);
      }
      System.out.println(Math.sqrt(sdsum/n));
    }
  }
}