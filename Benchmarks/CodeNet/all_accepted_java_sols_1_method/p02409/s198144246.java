import java.util.*;

public class Main {
    public static void main(String[] args){
        int data[][][] = new int[4][3][10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            data[b-1][f-1][r-1] += v;
        }
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<10; k++){
                    if(k == 0) System.out.printf(" ");
                    System.out.printf("%d", data[i][j][k]);
                    if(k != 9) System.out.printf(" ");
                }
                System.out.printf("\n");
            }
            if(i!=3) System.out.printf("####################\n");
        }
        sc.close();
    }
}
