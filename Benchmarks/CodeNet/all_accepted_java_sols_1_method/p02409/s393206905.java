import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][][] room = new int[4][3][10];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    room[i][j][k] = 0;
                }
            }
        }
        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            room[b-1][f-1][r-1] = room[b-1][f-1][r-1] + v;
        }
        sc.close();

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    if(k<9){
                        System.out.print(" " + room[i][j][k]);
                    }else{
                        System.out.println(" " + room[i][j][k]);
                    }
                }
            }
            if(i<3){
                System.out.println("####################");
            }
        }
    }
}


