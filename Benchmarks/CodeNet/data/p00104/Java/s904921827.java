public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, j, h, w;
    char[][] f;
    String s;
    int[][] v;

    for(;;){
      h = sc.nextInt(); w = sc.nextInt();
      if(h == 0 && w == 0)break;
      f = new char[h][w]; v = new int[h][w];

      for(i = 0;i < h;i++){
        s = sc.next();
        for(j = 0;j < w;j++)f[i][j] = s.charAt(j);
      }

      i = 0; j = 0; v[0][0] = 1; s = "GO";
      for(;;){
        if(f[i][j] == '>'){
          v[i][++j]++;
          if(v[i][j] == 2){
            s = "LOOP"; break;
          }
        }else if(f[i][j] == '<'){
          v[i][--j]++;
          if(v[i][j] == 2){
            s = "LOOP"; break;
          }
        }else if(f[i][j] == '^'){
          v[--i][j]++;
          if(v[i][j] == 2){
            s = "LOOP"; break;
          }
        }else if(f[i][j] == 'v'){
          v[++i][j]++;
          if(v[i][j] == 2){
            s = "LOOP"; break;
          }
        }else break;
      }
      if("LOOP".equals(s))out.println(s);
      else out.println(j + " " + i);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}