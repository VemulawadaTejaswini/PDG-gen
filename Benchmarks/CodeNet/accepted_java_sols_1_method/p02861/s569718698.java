import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    double sum = 0L;
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        sum += Math.sqrt((double)(x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
      }
    }
    System.out.println(sum * 2 / n);
  }
}