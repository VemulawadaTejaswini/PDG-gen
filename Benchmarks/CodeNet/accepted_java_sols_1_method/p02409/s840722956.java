import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int[][][] info = new int[4][3][10];
        int i=0,j=0,k=0;

        for(i=0; i < 4; i++){
            for(j=0; j < 3; j++){
                for(k=0; k < 10; k++)info[i][j][k] = 0;
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=0; i < n; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            info[b-1][f-1][r-1] += v;
        }
        
        for(i=0; i < 4; i++){
            for(j=0; j < 3; j++){
                for(k=0; k < 10; k++){
                    System.out.print(" " +info[i][j][k]);
                }
                System.out.println();
            }
            if(i<3) System.out.println("####################");
        }
    }
        
}
