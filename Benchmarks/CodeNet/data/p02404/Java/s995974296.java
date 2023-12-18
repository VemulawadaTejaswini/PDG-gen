public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int h, w;
    int i, j;

    for(;;){
      h = sc.nextInt();
      w = sc.nextInt();
      if(h == 0 && w == 0)break;

      for(i = 0;i < h;i++){
        for(j = 0;j < w;j++){
          if(i == 0 || j == 0 || i == h - 1 || j == w - 1){
            System.out.print("#");
          }else{
            System.out.print(".");
          }
        }
        System.out.println();
      }
      System.out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}