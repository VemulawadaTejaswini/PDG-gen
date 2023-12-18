import java.util.*;
class Main{
  static Scanner sc=new Scanner(System.in);
  public static void main(String args[]){
    int c[][] = new int[3][3];
    boolean F=false;
    for(int i=0;i<3;++i){
      for(int j=0;j<3;++j){
        c[i][j]=sc.nextInt();
      }
    }
    for(int a1=0;a1<=100&&!F;a1++){
      for(int a2=0;a2<=100&&!F;a2++){
        for(int a3=0;a3<=100&&!F;a3++){
          int b1=c[0][0]-a1,b2=c[0][1]-a1,b3=c[0][2]-a1;
          boolean L2,L3;
          L2=(c[1][0]==a2+b1&&c[1][1]==a2+b2&&c[1][2]==a2+b3);
          L3=(c[2][0]==a3+b1&&c[2][1]==a3+b2&&c[2][2]==a3+b3);
          F=L2&&L3;
        }
      }
    }
    System.out.println(F?"Yes":"No");
  }
}