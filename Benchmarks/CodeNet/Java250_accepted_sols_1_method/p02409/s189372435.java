import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int house[][][];
        house = new int[4][3][10];
        for(int h=0;h<4;h++){
          for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
              house[h][i][j] = 0;
            }
          }
        }

        for(int m=1;m<=n;m++){
          int b = sc.nextInt();
          int f = sc.nextInt();
          int r = sc.nextInt();
          int v = sc.nextInt();
          house[b-1][f-1][r-1] = house[b-1][f-1][r-1] + v;
        }
      for(int h2=0;h2<4;h2++){
        for(int i2=0;i2<3;i2++){
          for(int j2=0;j2<10;j2++){
            System.out.print(" " + house[h2][i2][j2]);
          }
          System.out.println("");
        }
        if(h2 != 3){
          for(int x=1;x<=20;x++){
          System.out.print("#");
          }
        }
        if(h2 != 3){
        System.out.println("");
      }
      }
    }
}
