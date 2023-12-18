
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H=scan.nextInt();
        int W=scan.nextInt();
        int K=scan.nextInt();

        int v[]=new int[H];
        int h[]=new int[W];
        int p=0;
        int k=0;
        int c[][]=new int[H][W];
        for(int i=0;i<H;i++){ String L=scan.next();
            for(int j=0;j<W;j++){

                if (L.substring(j,j+1).equals("#")){
                    v[i]=v[i]+1;
                    h[j]=h[j]+1;
                    c[i][j]=1;
               k++; }
            }

        }
int f=0;
        for (int iii = 0; iii < (1 << H); iii++) {

            for (int ii = 0; ii < (1 << W); ii++) {
            int S = k;
            f=0;
            for (int j = 0; j < H; j++) {

                if ((1 & iii >> j) == 1) {
                    S = S -v[j];
                }


                    for (int i = 0; i < W; i++) {

                        if ((1 & ii >> i) == 1&&f==0) {
                            S = S - h[i];}

                        if (((1 & ii >> i) == 1)&&((1 & iii >> j) == 1)&&(c[j][i]==1)){S++;}
                    }
                    f=1;
              }

                if (S==K){p++;}
            }

        }


        System.out.println(p);
    }
}
