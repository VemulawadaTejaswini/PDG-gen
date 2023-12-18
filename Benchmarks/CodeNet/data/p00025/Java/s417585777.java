public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] a, b;
    int i, j, hi, bl;

    a = new int[4];
    b = new int[4];

    for(;sc.hasNext();){
      hi = 0; bl = 0;
      for(i = 0;i < 4;i++)a[i] = sc.nextInt();
      for(i = 0;i < 4;i++)b[i] = sc.nextInt();
      for(i = 0;i < 4;i++)if(a[i] == b[i])hi++;
      for(i = 0;i < 4;i++)for(j = 0;j < 4;j++)if(a[i] == b[j])bl++;
      out.println(hi + " " + (bl - hi));
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}