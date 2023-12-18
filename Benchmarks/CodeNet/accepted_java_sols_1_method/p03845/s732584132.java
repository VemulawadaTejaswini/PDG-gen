import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int[] t = new int[n];
    for(int i=0; i<n; i++){
      t[i] = Integer.parseInt(scanner.next());
    }
    int m = Integer.parseInt(scanner.next());
    int[] p = new int[m];
    int[] x = new int[m];
    for(int i=0; i<m; i++){
      p[i] = Integer.parseInt(scanner.next());
      x[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();

    int sum = 0;
    for(int i=0; i<n; i++){
      sum += t[i];
    }

    for(int i=0; i<m; i++){
      System.out.println(sum-t[p[i]-1]+x[i]);
    }
  }
}
