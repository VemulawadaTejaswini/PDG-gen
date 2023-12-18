import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int gou = 0;
        int[][] a = new int [r+1][c+1];
        for(int i = 0; i<r; i++){
            int g = 0;
            int o = 0;
            for(int j = 0; j <c + 1; j++){
                if(c == j){
                    o += g;
                    System.out.print(g);
???????????????????????????
                }else{
                    int h = in.nextInt();
                    System.out.print(h + " ");
                    g += h;
                    a[i][j] = h;
                }
            }
        }
        System.out.println();
            for(int j = 0; j<c ; j++){
            int g2 = 0;
            for(int i = 0; i<r; i++){
                g2 += a[i][j];
                }
                gou += g2;
            System.out.print(g2 + " ");
            }
        System.out.print(gou);

    }
}