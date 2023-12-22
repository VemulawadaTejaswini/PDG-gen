import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = in.nextInt();
        int W = in.nextInt();
        int [][] arr = new int[H][W];
        for (int i = 0; i < H; i++) Arrays.fill(arr[i], 0);
        int h = in.nextInt();
        int w = in.nextInt();
        for (int row = 0; row < h; row++){
            Arrays.fill(arr[row], 1);
        }
        for (int i = 0; i < w; i++){
            for (int j = 0; j < H; j++){
                arr[j][i] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < H; i++){
            for (int j = 0; j < W; j++){
                //System.out.print(arr[i][j] + " ");
                if (arr[i][j] == 0) ans++;
            }
            //System.out.println();
        }
        System.out.println(ans);
    }
}