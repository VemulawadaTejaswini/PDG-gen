public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String s;
    char now;

    now = 'A';
    for(;sc.hasNext();){
      s = sc.next();
      if(s.charAt(0) == now)now = s.charAt(2);
      else if(s.charAt(2) == now)now = s.charAt(0);
    }
    out.println(now);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}