import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int A[][] = new int[n][m];
    int b[] = new int[m];
    int c[] = new int[n];

    for(int x = 0; x < n; x++){
      for(int y = 0; y < m; y++){
        int v = sc.nextInt();
        A[x][y] = v;
      }
      c[x] = 0;
    }
    for(int x = 0; x < m; x++){
      int v = sc.nextInt();
      b[x] = v;
    }

    for(int x = 0; x < n; x++){
      for(int y = 0; y < m; y++){
        c[x] = c[x]+(A[x][y]*b[y]);
      }
      System.out.println(c[x]);
    }
  }
}

