public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int h, w;
    int i, j, d, a, b;

    for(;;){
      h = sc.nextInt();
      w = sc.nextInt();
      if(h == 0 && w == 0)break;
      d = h * h + w * w;
      a = 150; b = 150;

      for(i = 1;i < 150;i++){
        for(j = i + 1;j < 150;j++){
          if(i * i + j * j > d || (i * i + j * j == d && i > h)){
            if(i * i + j * j < a * a + b * b ||
            (i * i + j * j == a * a + b * b && i < a)){
              a = i; b = j;
            }
          }
        }
      }
      out.println(a + " " + b);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}