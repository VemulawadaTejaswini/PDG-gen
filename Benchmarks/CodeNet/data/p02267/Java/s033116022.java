import java.util.Scanner;

class Main{

  static boolean isIncluded(int[] a, int n){
    int i = 0;
    while(a[i] != a[n])
      i++;

    if(i == n)
      return false;
    else
      return true;

  }

  public static void main(String[] arsg){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n+1];

    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    int q = stdIn.nextInt();
    int count = 0;
    for(int i = 0; i < q; i++){
      a[n] = stdIn.nextInt();
      if(isIncluded(a, n))
        count++;
    }

    System.out.println(count);
  }
}