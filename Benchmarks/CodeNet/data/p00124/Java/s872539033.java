public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] w, d;
    String[] name;
    int i, j, tmp;
    String st;

    n = sc.nextInt();
    for(;;){
      w = new int[n];
      d = new int[n];
      name = new String[n];

      for(i = 0;i < n;i++){
        name[i] = sc.next();
        w[i] = sc.nextInt();
        d[i] = sc.nextInt();
        d[i] = sc.nextInt();
        d[i] += 3 * w[i];
      }

      for(i = 0;i < n - 1;i++){
        for(j = 0;j < n - 1 - i;j++){
          if(d[j] < d[j + 1]){
            st = name[j]; name[j] = name[j + 1]; name[j + 1] = st;
            tmp = d[j]; d[j] = d[j + 1]; d[j + 1] = tmp;
          }
        }
      }

      for(i = 0;i < n;i++)System.out.println(name[i] + "," + d[i]);

      n = sc.nextInt();
      if(n == 0)break;
      else System.out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}