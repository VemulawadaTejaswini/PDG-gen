import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = sc.nextInt();
        int dataroom[][][] = new int[3][10][4];
        int b,f,r,v;

        for(int i = 0; i < datanum; i++){
            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();
            dataroom[f-1][r-1][b-1] += v;
        }

        for(int i = 0; i < 4; i++ ){
            for(int m = 0; m < 3; m++ ){
                for(int n = 0; n < 10; n++){
                    System.out.print(" " + dataroom[m][n][i]);
                }
                System.out.println();
            }
            if( i != 3 ) System.out.println("####################");
        }
    }
}
