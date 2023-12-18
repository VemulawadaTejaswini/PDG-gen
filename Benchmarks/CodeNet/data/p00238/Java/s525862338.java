public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int t, n, s, f, sum, i;

    for(;;){
      t = sc.nextInt();
      if(t == 0)break;

      n = sc.nextInt();
      sum = 0;
      for(i = 0;i < n;i++){
        s = sc.nextInt(); f = sc.nextInt();
        sum += f - s;
      }

      if(sum >= t)out.println("OK");
      else out.println(t - sum);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}