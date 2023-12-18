public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] c;
    int i;
    c = new int[6];

    for(i = 0;i < 6;i++)c[i] = sc.nextInt();
    if(c[0] + c[1] * 5 + c[2] * 10 + c[3] * 50 + c[4] * 100 + c[5] * 500 >= 1000)
      out.println("1");
    else out.println("0");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}