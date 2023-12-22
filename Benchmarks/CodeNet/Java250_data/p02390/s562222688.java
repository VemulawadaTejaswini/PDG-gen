public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int s;
    s = sc.nextInt();
    System.out.println((s / 3600) + ":" + ((s % 3600) / 60) + ":" + (s % 60));
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}