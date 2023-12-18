public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j;
    int[] ice = new int[10];
    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      for(i = 0;i < 10;i++)ice[i] = 0;
      for(;n-- > 0;)ice[sc.nextInt()]++;
      for(i = 0;i < 10;i++){
        if(ice[i] == 0)out.print("-");
        else for(;ice[i]-- > 0;)out.print("*");
        out.println();
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}