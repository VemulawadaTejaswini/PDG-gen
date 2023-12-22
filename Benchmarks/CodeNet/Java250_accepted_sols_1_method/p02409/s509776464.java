import java.util.Scanner;                                                                        
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count[][][] = new int[4][3][10];
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 2; j++){
                for(int e = 0; e <= 9; e++){
                    count[i][j][e] = 0;
                }
            }
        }
        for(int i =1; i <= n; i++){
        int b = in.nextInt();
        int f = in.nextInt();
        int r = in.nextInt();
        int v = in.nextInt();
        count[b-1][f-1][r-1] += v;
        }
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 2; j++){
                   for(int e = 0; e <= 9; e++){
                    System.out.print(" " + count[i][j][e]);
                }
                System.out.println();
            }
            if(i != 3){
            System.out.println("####################");
            }
        }
    }
}              