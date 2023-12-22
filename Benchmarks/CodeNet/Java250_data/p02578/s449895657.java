import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++){
      int A = scan.nextInt();
      a[i] = A;
    }
    long ans = 0;
    for (int i = 1; i < n; i++){
      if (a[i-1] > a[i]){
        ans = ans + (a[i-1]-a[i]);
        a[i] = a[i-1];
      }
    }
   System.out.println(ans);
  }
}