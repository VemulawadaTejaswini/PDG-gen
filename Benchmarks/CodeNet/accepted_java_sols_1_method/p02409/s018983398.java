import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();

        int[][][] array;
        array = new int[4][3][10];

        for(int i = 0; i < count; i++){
            int b = scn.nextInt();
            int f = scn.nextInt();
            int r = scn.nextInt();
            int v = scn.nextInt();
            array[b - 1][f -1][r -1] += v;
        }


        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    System.out.printf(" %d",array[i][j][k]);
                }
                System.out.printf("\n");
            }
            if(i != 3) System.out.printf("####################\n");
        }

    }
}
