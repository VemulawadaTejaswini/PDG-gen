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
        int sumTemp = 0;
        for(int j = i; j < n; j++) {
          sumTemp += seq[j];
          if (sumMax < sumTemp) {
            sumMax = sumTemp;
          }
        }
      }
      System.out.println(sumMax);
    }
  }
}