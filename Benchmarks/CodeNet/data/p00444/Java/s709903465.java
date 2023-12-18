public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, sum;
    int[] c;

    c = new int[6];
    c[0] = 1; c[1] = 5; c[2] = 10; c[3] = 50; c[4] = 100; c[5] = 500;

    for(;;out.println(sum)){
      n = sc.nextInt(); if(n == 0)break;
      sum = 0; n = 1000 - n;
      for(i = 5;i > -1;i--)if(c[i] <= n){
        sum += n / c[i]; n %= c[i];
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}