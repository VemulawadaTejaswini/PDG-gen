public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int x, y;
    int tmp;

    x = sc.nextInt();
    y = sc.nextInt();

    for(;;){
      if(x < y){
        tmp = x;
        x = y;
        y = tmp;
      }
      tmp = y;
      y = x % y;
      x = tmp;
      if(x == 0 || y == 0){
        System.out.println(x + y);
        break;
      }
    }
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}