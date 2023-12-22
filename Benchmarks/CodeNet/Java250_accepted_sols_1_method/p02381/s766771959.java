import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      int sum = 0;
      int[] stu = new int[n];
      for(int i = 0; i < n; i++) {
        stu[i] = sc.nextInt();
        sum += stu[i];
      }
      double ave = sum / (double) n;
      double dveSum = 0.0;
      for(int i = 0; i < n; i++) {
        dveSum += Math.pow(stu[i] - ave, 2);
      }
      double dve = Math.sqrt(dveSum / (double) n);
      System.out.println(dve);
    }
  }
}

