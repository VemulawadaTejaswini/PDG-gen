import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()){
      int n = in.nextInt();
      if (n == 0) break;
      int[] numbers = new int[n];
      long double_sum = 0;
      long sum_double = 0;
      
      for (int i = 0; i < n; i++) {
        numbers[i] = in.nextInt();
        double_sum += numbers[i];
      }
      double_sum = double_sum * double_sum;
      for (int i = 0; i < n; i++) sum_double += (numbers[i] * numbers[i]);
      
      double sd = Math.sqrt((sum_double - double_sum / (double)n) / (double)n);
      
      System.out.printf("%5.8f", sd);
      System.out.println();
    }
  }
}