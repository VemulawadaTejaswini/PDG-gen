import java.util.Scanner;

class Main{

  static boolean solve(int[] a, int m, int i){
    if(m == 0)
      return true;
    if(i == a.length)
      return false;
    else
      return solve(a, m, i + 1) || solve(a, m - a[i], i + 1);
  }


  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    int q = stdIn.nextInt();
    int[] b = new int[q];
    for(int i = 0; i < q; i++)
      b[i] = stdIn.nextInt();

    for(int i = 0; i < q; i++){
      if(solve(a, b[i], 0))
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}