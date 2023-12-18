import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[][][] kousya=new int[4][3][10];
    for(int i=0;i<n;i++){
      int b=Integer.parseInt(scan.next());
      int f=Integer.parseInt(scan.next());
      int r=Integer.parseInt(scan.next());
      int v=Integer.parseInt(scan.next());

      switch(b){
        case 1:
            if(kousya[b-1][f-1][r-1]<10){
              kousya[b-1][f-1][r-1]+=v;
            }
            break;
        case 2:
            if(kousya[b-1][f-1][r-1]<10){
              kousya[b-1][f-1][r-1]+=v;
            }
            break;
        case 3:
            if(kousya[b-1][f-1][r-1]<10){
              kousya[b-1][f-1][r-1]+=v;
            }
            break;
        case 4:
            if(kousya[b-1][f-1][r-1]<10){
              kousya[b-1][f-1][r-1]+=v;
            }
        default : System.out.println("エラー");break;
      }
    }

    for(int i=0;i<kousya.length;i++){
      for(int j=0;j<kousya[i].length;j++){
        for(int k=0;k<kousya[i][j].length;k++){
          System.out.print(kousya[i][j][k]);
          if(k<kousya[i][j].length){
            System.out.print(" ");
          }
        }
        System.out.println();
        if(j==kousya[i].length-1){
          System.out.println("####################");
        }
      }
    }

  }
}
