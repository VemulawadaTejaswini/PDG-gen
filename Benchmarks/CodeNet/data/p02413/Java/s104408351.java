import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        // ??\???
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] H = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                H[i][j] = scan.nextInt();
            }
        }
        System.out.println();

        int allSum = 0;
        // ??????????????????
        for(int i = 0; i < r; i++){
            int cSum = 0;
            for(int j = 0; j < c; j++){
                System.out.print(H[i][j] + " ");
                cSum += H[i][j];
            }
            System.out.println(cSum);
            allSum += cSum;
        }

        for(int j = 0; j < c; j++){
            int rSum = 0;
            for(int i = 0; i < r; i++){
                rSum += H[i][j];
            }
            System.out.print(rSum);
            System.out.print(" ");
        }
        System.out.println(allSum);

        System.out.println();
    }
}