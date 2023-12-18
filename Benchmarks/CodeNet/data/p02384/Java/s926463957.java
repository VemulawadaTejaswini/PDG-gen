public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] d = new int[6];
    int i, q, a, b;
    for(i = 0;i < 6;i++)d[i] = sc.nextInt();
    for(q = sc.nextInt();q-- > 0;out.println(solve(d, a, b))){
      a = sc.nextInt(); b = sc.nextInt();
    }

    sc.close();
  }
  private static int solve(int[] d, int a, int b){
    int i, j;
    for(i = 0;i < 3;i++){
      for(j = 0;j < 4;j++){
        if(d[0] == a && d[1] == b)return d[2];
        rroll(d);
      }
      if(d[0] == a && d[1] == b)return d[2];
      nroll(d);
      for(j = 0;j < 4;j++){
        if(d[0] == a && d[1] == b)return d[2];
        rroll(d);
      }
      if(d[0] == a && d[1] == b)return d[2];
      eroll(d);
    }
    return -1;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void nroll(int[] dice){ //(1265)
    int tmp;
    tmp = dice[0]; dice[0] = dice[1]; dice[1] = dice[5];
    dice[5] = dice[4]; dice[4] = tmp;
    return;
  }
  private static void eroll(int[] dice){ //(1463)
    int tmp;
    tmp = dice[0]; dice[0] = dice[3]; dice[3] = dice[5];
    dice[5] = dice[2]; dice[2] = tmp;
    return;
  }
  private static void rroll(int[] dice){ //(2354)
    int tmp;
    tmp = dice[1]; dice[1] = dice[2]; dice[2] = dice[4];
    dice[4] = dice[3]; dice[3] = tmp;
    return;
  }
}