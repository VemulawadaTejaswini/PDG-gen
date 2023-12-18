import java.util.Scanner;
public class Main{
  public static void printa(int[][][] a){
    int i,j,k;
    for(i=0;i<4;i++){
      for(j=0;j<3;j++){
        for(k=0;k<10;k++){
          System.out.printf(" %d",a[i][j][k]);
        }
        System.out.println();
      }if(i==3) break;
      for(j=0;j<20;j++)
      System.out.printf("#");
      System.out.println();
    }  

  }
  public static void main(String[] args){
    int n,b,f,r,v;
    int[][][] a =new int[4][3][10];
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    while(true){
      if(n==0) break;
      b = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      v = sc.nextInt();
      a[b-1][f-1][r-1]+=v;
      n--;
    }
    printa(a);
    sc.close();
  }
}
