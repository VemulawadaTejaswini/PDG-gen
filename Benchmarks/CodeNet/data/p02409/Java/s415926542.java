import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int b, f, r, v, i, j, k;
        int a[][][] = new int[4][3][10];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                for(k = 0; k < 10; k++){
                    a[i][j][k] = 0;
        		}
        	}
        }
        for(i = 0; i < n; i++){
            b = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            v = scan.nextInt();
            if(b != 0){
                a[b - 1][f - 1][r - 1] += v;
                if(a[b - 1][f - 1][r - 1] < 0) a[b - 1][f - 1][r - 1] = 0;
            }
        }
        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                for(k = 0; k < 10; k++){
                    System.out.printf(" %d", a[i][j][k]);
                }
                System.out.print("\n");
        	}
            if(i != 3) System.out.printf("####################\n");
        }
    }
}

