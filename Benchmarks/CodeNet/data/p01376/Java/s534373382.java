public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, a, max, i, j;
    m = sc.nextInt(); n = sc.nextInt();
    max = -1;
    for(i = 0;i < m;i++){
      a = 0;
      for(j = 0;j < n;j++)a += sc.nextInt();
      if(max < a)max = a;
    }
    out.println(max);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}