import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int nans = n * (n-1) / 2;
    int mans = m * (m-1) / 2;
    int ans = nans + mans;
    System.out.println(ans);
  }
}