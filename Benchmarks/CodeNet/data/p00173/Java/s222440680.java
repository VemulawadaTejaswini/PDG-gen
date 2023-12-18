public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, b;
    for(;sc.hasNext();){
      out.print(sc.next() + " ");
      a = sc.nextInt(); b = sc.nextInt();
      out.println((a + b) + " " + (200 * a + 300 * b));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}