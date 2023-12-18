public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, p, i, max;
    int[] x;

    x = new int[5];
    for(;;){
      a = sc.nextInt(); p = sc.nextInt();
      if(a == 0 && p == 0)break;
      x[0] = a + p; max = 0;
      for(i = 1;i < 5;i++){
        a = sc.nextInt(); p = sc.nextInt();
        x[i] = a + p;
        if(x[max] < x[i])max = i;
      }

      if(max == 0)out.println("A " + x[max]);
      else if(max == 1)out.println("B " + x[max]);
      else if(max == 2)out.println("C " + x[max]);
      else if(max == 3)out.println("D " + x[max]);
      else out.println("E " + x[max]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}