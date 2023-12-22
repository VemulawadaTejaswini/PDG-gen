import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f[][][] = new int[4][3][10];
        for(int a=0;a<4;a++){
            for(int b=0;b<3;b++){
                for(int c=0;c<10;c++){
                    f[a][b][c] = 0;
                }
            }
        }
        for(int i=0;i<n;i++){
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            f[a-1][b-1][c-1] += sc.nextInt();
        }
        for(int a=0;a<4;a++){
            for(int b=0;b<3;b++){
                for(int c=0;c<10;c++){
                    System.out.print(" "+f[a][b][c]);
                }
                if(a<3 || b < 2){
                    
                }
                System.out.println();
            }
            if(a<3){
                for(int i=0;i<20;i++)System.out.print("#");
                System.out.println();
            }
            
        }
    }
}
