public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int w;
    for(;;out.println(-solve(w) + 4280)){
      w = sc.nextInt(); if(w == -1)break;
    }

    sc.close();
  }
  private static int solve(int w){
    int res = 0;
    if(w < 10)return 1150;
    res += 1150; w -= 10;
    if(w < 10)return (res + 125 * w);
    res += 1250; w -= 10;
    if(w < 10)return (res + 140 * w);
    res += 1400; w -= 10;
    return (res + 160 * w);
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}