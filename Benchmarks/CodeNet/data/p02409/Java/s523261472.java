import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] a = new int[5][4][11];
        int b, f, r, v;
        for(int i =0; i<n; i++){
            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();
            a[b][f][r] += v;
            if(a[b][f][r] < 0) a[b][f][r] = 0;
        }
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 4; j++){
                for(int k = 1; k<11; k++){
                    System.out.printf(" %d", a[i][j][k]);
                }
                if(i == 4 && j == 3) break;
                System.out.println();
            }
            if(i < 4){
                for(int l = 0; l<20; l++){
                System.out.printf("#");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
