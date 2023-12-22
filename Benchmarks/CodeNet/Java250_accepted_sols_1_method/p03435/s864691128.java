//youtubeの解説動画を見て書きました。
import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[][] c = new int[3][3];
    int[] rx = new int[3];
    int[] ry = new int[3];
    boolean flag = true;

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        c[i][j] = scan.nextInt();
      }
    }

    ry[0] = 0;
    for(int j = 0; j < 3; j++){rx[j] = c[0][j] - ry[0];}
    for(int j = 1; j < 3; j++){ry[j] = c[j][0] - rx[0];}

    outside:for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if(rx[j]+ry[i] != c[i][j]){
          flag = false;
          System.out.println("No");
          break outside;
        }
      }
    }

    if(flag){System.out.println("Yes");}
  }
}
//aを決めてしまえば他も決まるという発想は合っていたが、
//aの決め方が理解できていなかったなという感じ。
/*outside:for(int i = 0; i < 3; i++){
  int a = 101;
  for(int j = 0; j < 3; j++){
    a = Math.min(c[i][j], a);
  }
  if(i == 0){
    for(int j = 0; j < 3; j++){
      r[j] = c[i][j] - a;
    }
  }
  if(i > 0){
    for(int j = 0; j < 3; j++){
      if(r[j] != c[i][j]-a){
        flag = false;
        System.out.println("No");
        break outside;
      }
    }
  }
}

if(flag == true){System.out.println("Yes");}*/
