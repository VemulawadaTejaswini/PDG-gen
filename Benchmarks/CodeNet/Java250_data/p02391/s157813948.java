public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    if(a < b){
      System.out.println("a < b");
    }else if(a > b){
      System.out.println("a > b");
    }else{
      System.out.println("a == b");
    }
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}