import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[4][3][10];
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int v = sc.nextInt();

            a[b-1][c-1][d-1] += v; 
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    System.out.print(" "+a[i][j][k]);
                }
                System.out.println();
            }
            if(i!=3) System.out.println("####################");
        }sc.close();

    }    
}
