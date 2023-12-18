import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = Integer.parseInt(sc.next());
      if(n == 0) break;
      int first = Integer.parseInt(sc.next());
      int max = first;
      int min = first;
      int sum = first;
      for(int i = 1; i < n; i++){
        int n2 = Integer.parseInt(sc.next());
        if(max < n2) max = n2;
        if(min > n2) min = n2;
        sum += n2;
      }
      double ave = Math.floor((sum - min - max) / (n - 2));
      System.out.printf("%.0f\n", ave);
    }
  }
}
