import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] ans  = new int[n+1];

    for(int i=0; i<n; ++i) a[i] = sc.nextInt();
    for(int i=1; i<ans.length; ++i) {
      ans[a[i-1]] = i;
    }

    for(int i=1; i<ans.length; ++i) {
      System.out.print(ans[i]);
      System.out.print(" ");
    }

  }
}