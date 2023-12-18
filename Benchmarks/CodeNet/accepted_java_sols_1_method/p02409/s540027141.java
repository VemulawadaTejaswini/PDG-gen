import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] menber = new int[4][3][10];
        
        for(int i = 1 ; i <= n ; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            menber[b-1][f-1][r-1] += v;
        }
        
        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= 3 ; j++){
                for(int k = 1 ; k <= 10 ; k++){
                    System.out.print(" " + menber[i-1][j-1][k-1]);
                }
                System.out.println();
            }
            if(i != 4){
                System.out.println("####################");
            }
        }
    }
}
