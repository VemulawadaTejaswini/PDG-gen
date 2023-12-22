import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] line = new String[h];
    int[][] field = new int[w+2][h+2];
    int[][] mine = new int[w+2][h+2];

    for(int i=0;i<h;i++){
      line[i] = sc.next();
    }

    //mine は#がある場所を-1で記憶
    for(int i=0;i<h+2;i++){
      for(int j=0;j<w+2;j++){
        if(0<i && i<h+1 && 0<j && j<w+1){
          if(line[i-1].charAt(j-1) == '#'){
            mine[j][i] = -1;
          }
        }
        field[j][i] = 0;    //fieldの初期化
      }
    }

    for(int i=0;i<h+2;i++){
      for(int j=0;j<w+2;j++){
        // #かどうか判別
        if(mine[j][i] == -1){
          // # の周り3*3全てをプラス１
          for(int l=i-1;l<i+2;l++){
            for(int m=j-1;m<j+2;m++){
              field[m][l] = field[m][l] + 1;
            }
          }
        }
      }
    }

    for(int i=1;i<h+1;i++){
      for(int j=1;j<w+1;j++){
        if(mine[j][i] == -1){
          System.out.print('#');
        }else{
          System.out.print(field[j][i]);
        }
      }
      System.out.println("");
    }

  }
}