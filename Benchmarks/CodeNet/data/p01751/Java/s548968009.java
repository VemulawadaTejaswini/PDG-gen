public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, b, c, t, i, j;

    a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
    for(t = 0;t <= 3600;t += a + b){
      for(i = 0;i < 60;i++){
        if(t <= c + 60 * i && c + 60 * i <= t + a){
          out.println(c + 60 * i); break;
        }
      }
      if(i < 60)break;
    }
    if(t > 3600)out.println("-1");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}