public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] w, k;
    int i, j, tmp;

    w = new int[10]; k = new int[10];
    for(i = 0;i < 10;i++)w[i] = sc.nextInt();
    for(i = 0;i < 10;i++)k[i] = sc.nextInt();
    for(i = 0;i < 9;i++)for(j = 0;j < 9 - i;j++){
      if(w[j] < w[j + 1]){
        tmp = w[j]; w[j] = w[j + 1]; w[j + 1] = tmp;
      }
      if(k[j] < k[j + 1]){
        tmp = k[j]; k[j] = k[j + 1]; k[j + 1] = tmp;
      }
    }
    out.printf("%d %d%n", w[0] + w[1] + w[2], k[0] + k[1] + k[2]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}