public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, o;
    String[] u;
    String t;

    n = sc.nextInt();
    u = new String[n];
    for(i = 0;i < n;i++)u[i] = sc.next();

    m = sc.nextInt(); o = 0;
    for(i = 0;i < m;i++){
      t = sc.next();
      for(j = 0;j < n;j++)if(u[j].equals(t)){
        if(o % 2 == 0)out.print("Opened by ");
        else out.print("Closed by ");
        out.println(t);
        o++;
        break;
      }
      if(j == n)out.println("Unknown " + t);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}