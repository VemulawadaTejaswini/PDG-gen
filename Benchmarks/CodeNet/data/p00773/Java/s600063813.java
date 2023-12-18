public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int x, y, s, i, j, max, m, a, b, c, d;

    for(;;){
      x = sc.nextInt(); y = sc.nextInt(); s = sc.nextInt();
      if(x == 0 && y == 0 && s == 0)break;
      max = -1; b = 0; c = 0; d = 0;
      for(i = 1;i < s;i++){
        a = i * (100 + x) / 100;
        for(j = 1;j < s;j++){
          b = j * (100 + x) / 100;
          if(a + b > s && c + d == s){
            j--; b = j * (100 + x) / 100; break;
          }
          c = i * (100 + x) / 100;
          d = j * (100 + x) / 100;
        }
        m = (i * (100 + y) / 100);
        m += (j * (100 + y) / 100);
        if(max < m && j > 0 && j < s)max = m;
      }
      out.println(max);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}