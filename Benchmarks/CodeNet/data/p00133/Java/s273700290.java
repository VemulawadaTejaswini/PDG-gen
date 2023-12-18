public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, j;
    char[][] f;
    String s;

    f = new char[8][8];
    for(i = 0;i < 8;i++){
      s = sc.next();
      for(j = 0;j < 8;j++)f[i][j] = s.charAt(j);
    }

    roll(f);
    out.println("90");
    for(i = 0;i < 8;i++){
      for(j = 0;j < 8;j++)out.print(f[i][j]);
      out.println();
    }
    roll(f);
    out.println("180");
    for(i = 0;i < 8;i++){
      for(j = 0;j < 8;j++)out.print(f[i][j]);
      out.println();
    }
    roll(f);
    out.println("270");
    for(i = 0;i < 8;i++){
      for(j = 0;j < 8;j++)out.print(f[i][j]);
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void roll(char[][] f){
    int i, j;
    char tmp;

    for(i = 0;i < 4;i++)for(j = 0;j < 4;j++){
      tmp = f[i][j]; f[i][j] = f[7 - j][i]; f[7 - j][i] = f[7 - i][7 - j];
      f[7 - i][7 - j] = f[j][7 - i]; f[j][7 - i] = tmp;
    }
    return;
  }
}