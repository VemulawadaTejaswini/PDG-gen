public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int t, s, i;

    for(i = 0;i < 4;i++){
      t = sc.nextInt(); s = sc.nextInt();
      if(t == 1)out.println(6000 * s);
      else if(t == 2)out.println(4000 * s);
      else if(t == 3)out.println(3000 * s);
      else out.println(2000 * s);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}