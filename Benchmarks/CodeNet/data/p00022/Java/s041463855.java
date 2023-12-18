import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      int[] seq = new int[n];
      for(int i = 0; i < n; i++) {
        seq[i] = sc.nextInt();
      }
      int sumMax = 0;
      for(int i = 0; i < n; i++) {
        for(int j = i; j < n; j++) {
          int sumTemp = 0;
          for (int k = i; k <= j; k++) {
            sumTemp += seq[k];
          }
          if (sumMax < sumTemp) {
            sumMax = sumTemp;
          }
        }
      }
      System.out.println(sumMax);
    }
  }
}