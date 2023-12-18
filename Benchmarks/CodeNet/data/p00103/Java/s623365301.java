public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String st;
    int n, score, run, count;
    int i;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      score = 0; run = 0; count = 0;
      for(;;){
        st = sc.next();
        if("HIT".equals(st)){
          ++run;
          if(run == 4){
            run = 3; score++;
          }
        }else if("OUT".equals(st)){
          if(++count == 3)break;
        }else{
          score += run + 1; run = 0;
        }
      }
      out.println(score);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}