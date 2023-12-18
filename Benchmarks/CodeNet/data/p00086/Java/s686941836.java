public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b;
    int[] count;
    int i, n;

    count = new int[100];
    for(;sc.hasNext();){
      for(i = 0;i < 100;i++)count[i] = 0;
      n = 0;
      for(;;){
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == 0 && b == 0)break;
        count[a - 1]++; count[b - 1]++;
      }

      for(i = 2;i < 100;i++)if(count[i] % 2 != 0)n = 1;

      if(n == 1)out.println("NG");
      else out.println("OK");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}