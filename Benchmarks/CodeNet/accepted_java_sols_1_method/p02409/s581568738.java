import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] room = {{{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}},{{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}},{{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}},{{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}}};

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int b = sc.nextInt() -1;
            int f = sc.nextInt() -1;
            int r = sc.nextInt() -1;
            int v = sc.nextInt();

            room[b][f][r] += v;
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<10; k++){
                    System.out.print(" " + room[i][j][k]);
                 
                }
                if(j==2 && i==3){
                    int a = 0;
                }else{
                System.out.print("\n");
                }
            }
            if(i != 3)
            System.out.println("####################");
        }
        System.out.print("\n");
    }
}
