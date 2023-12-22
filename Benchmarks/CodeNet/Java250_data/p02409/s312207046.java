public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, b, f, r, v;
    int[][][] a;
    int i, j, k;

    n = sc.nextInt();
    a = new int[4][3][10];

    for(i = 0;i < n;i++){
      b = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      v = sc.nextInt();
      a[b - 1][f - 1][r - 1] += v;
    }

    for(i = 0;i < 4;i++){
      for(j = 0;j < 3;j++){
        for(k = 0;k < 10;k++){
          System.out.print(" " + a[i][j][k]);
        }
        System.out.println();
      }
      if(i == 3)break;
      System.out.println("####################");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}