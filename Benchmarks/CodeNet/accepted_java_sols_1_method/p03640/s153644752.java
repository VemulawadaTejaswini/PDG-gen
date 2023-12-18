import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        sc.close();
        int[][] c = new int[H][W];

        int h = 0;
        int w = 0;
        int count = 0;
        while(count < N){
            while(a[count] > 0){
                c[h][w] = count+1;
                a[count]--;
                w++;
                if(w == W){
                    h++;
                    w = 0;
                }
                
            }
            count++;
        }
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(i%2 == 0)
                    System.out.print(c[i][j]+ " ");
                else
                    System.out.print(c[i][W-j-1]+ " ");
            }
            System.out.println();
        }
    }
}