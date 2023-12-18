public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int x, e, i, j, m;

    for(;;){
      e = sc.nextInt();
      if(e == 0)break;
      m = e;
      for(i = 0;i * i * i <= e;i++)for(j = 0;j * j <= e;j++)
        if(i * i * i + j * j <= e){
          x = e - (i * i * i + j * j);
          if(m > x + j + i)m = x + j + i;
        }
      out.println(m);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}