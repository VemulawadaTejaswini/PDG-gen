import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt(),w = sc.nextInt();
    int[][] res = new int[h][w];
    int ctn;
    String buff;

    for(int i=0;i<h;i++){
      ctn = -1;
      buff = sc.next();
      for(int j=0;j<w;j++){
        switch(buff.charAt(j)){
          case 'c':
            ctn = 0;
            res[i][j] = ctn++;
            break;
          case '.':
            res[i][j] = ctn;
            if(ctn != -1) ctn++;
            break;
        }
      }
    }

    for(int i = 0;i<h;i++){
      for(int j = 0;j<w;j++){
        System.out.print(res[i][j]);
        if(j != w - 1) System.out.print(" ");
      }
      System.out.println();
    }
  }
}