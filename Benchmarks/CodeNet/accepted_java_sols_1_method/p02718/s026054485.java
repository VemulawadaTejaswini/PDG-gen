import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;
    int sum = 0;
    int[] a = new int[n];
    for(int i = 0;i < n;i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    double line  = ((double)sum / (4 * m));
    for(int j = 0;j < n;j++){
      if(a[j] >= line) count++;
    }
    if(m <= count){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}