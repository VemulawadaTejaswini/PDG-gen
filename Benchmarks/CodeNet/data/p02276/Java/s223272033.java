import java.util.Scanner;

class Main{
  static int partition(int[] a, int p, int r){
    int x = a[r];
    int i = p-1;
    for(int j = p; j < r; j++){
      if(a[j] <= x){
        i++;
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
      }
    }
    int tmp = a[i+1];
    a[i+1] = a[r];
    a[r] = tmp;
    return i+1;
  }

  static void output(int[] a, int q){
    int i;
    for(i = 0; i < q; i++)
      System.out.print(a[i] + " ");
    System.out.print("[" + a[i] + "] ");
    for(i = q + 1; i < a.length - 1; i++)
      System.out.print(a[i] + " ");
    System.out.println(a[i]);

  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    output(a, partition(a, 0, n-1));
  }
}