public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i;
    int a = 100000;

    n = sc.nextInt();

    for(i = 0;i < n;i++){
      a *= 1.05;
      if(a % 1000 != 0){
        a /= 1000;
        a *= 1000;
        a += 1000;
      }
    }

    System.out.println(a);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}