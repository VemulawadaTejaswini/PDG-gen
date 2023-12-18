public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String w, t;
    int count;

    count = 0;
    w = sc.next();
    for(;;){
      t = sc.next();
      if("END_OF_TEXT".equals(t)){
        break;
      }else if(w.equals(t)){
        count++;
      }
    }

    System.out.println(count);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}