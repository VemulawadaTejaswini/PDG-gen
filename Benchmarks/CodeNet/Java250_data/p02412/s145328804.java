public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, x;
    int i, j, k, count;

    for(;;){
      n = sc.nextInt();
      x = sc.nextInt();
      if(n == 0 && x == 0)break;

      count = 0;
      for(i = 1;i <= n;i++){
        for(j = i + 1;j <= n;j++){
          if(x - i - j > j && x - i - j <= n)count++;
        }
      }

      System.out.println(count);
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}