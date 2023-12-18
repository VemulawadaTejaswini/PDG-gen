import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] data = new int[1000];
    while(true){
      int sum = 0;
      double p = 0;
      double ave;
      int n = scanner.nextInt();
    for (int i = 0; i < n; i++){
      int a = scanner.nextInt();
      data[i] = a;
      sum += a;
    }
    if(n == 0) break;
    ave = (double)sum / n;
    for(int i = 0; i < n; i++){
      p += ((double)data[i] - ave)*((double)data[i] - ave);
    }
    p /= n;
    double s = Math.sqrt(p);
    System.out.printf("%.8f\n", s);
  }
  }
}