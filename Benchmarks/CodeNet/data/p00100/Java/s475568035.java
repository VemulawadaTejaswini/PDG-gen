public class Main{
  static int N = 4000;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    long[] a;
    int i, n, x, count;
    long y, z;

    a = new long[N];
    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      for(i = 0;i < N;i++)a[i] = 0;
      count = 0;
      for(i = 0;i < n;i++){
        x = sc.nextInt(); y = sc.nextLong(); z = sc.nextLong();
        a[x - 1] += y * z;
      }

      for(i = 0;i < N;i++)if(a[i] >= 1000000){
        out.println(i + 1); count++;
      }
      if(count == 0)out.println("NA");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}