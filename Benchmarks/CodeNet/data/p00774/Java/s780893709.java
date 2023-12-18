public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[][] f;
    int count;
    int i, j, k, l, score, h, tmp;

    for(;;){
      h = sc.nextInt();
      if(h == 0)break;
      f = new int[h][5];
      for(i = 0;i < h;i++)for(j = 0;j < 5;j++)f[i][j] = sc.nextInt();
      score = 0;

      for(k = 0;k < h;k++){
        for(i = 0;i < h;i++){
          count = 0;
          for(j = 0;j < 5;j++)if(f[i][j] == f[i][2] && f[i][2] != 0)count++;
          if(count == 5){
            score += 5 * f[i][2];
            for(j = 0;j < 5;j++)f[i][j] = 0;
          }else if(count >= 3){
            if(f[i][2] != f[i][0] && f[i][2] == f[i][1] && count == 4){
              score += 4 * f[i][2];
              for(j = 1;j < 5;j++)f[i][j] = 0;
            }else if(f[i][2] != f[i][4] && f[i][2] == f[i][1] && count == 4){
              score += 4 * f[i][2];
              for(j = 0;j < 4;j++)f[i][j] = 0;
            }else if(f[i][2] == f[i][3] && f[i][2] == f[i][4]){
              score += 3 * f[i][2];
              for(j = 2;j < 5;j++)f[i][j] = 0;
            }else if(f[i][2] == f[i][1] && f[i][2] == f[i][3]){
              score += 3 * f[i][2];
              for(j = 1;j < 4;j++)f[i][j] = 0;
            }else if(f[i][2] == f[i][0] && f[i][2] == f[i][1]){
              score += 3 * f[i][2];
              for(j = 0;j < 3;j++)f[i][j] = 0;
            }
          }
        }

        for(j = 0;j < 5;j++){
          for(i = 1;i < h;i++){
            if(f[i][j] == 0){
              tmp = f[i][j];
              for(l = i;l > 0;l--)f[l][j] = f[l - 1][j];
              f[l][j] = 0;
            }
          }
        }
      }

      out.println(score);
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}