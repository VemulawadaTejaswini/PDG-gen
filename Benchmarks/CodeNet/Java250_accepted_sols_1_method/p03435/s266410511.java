import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] map = new int[3][3];
        boolean ans = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 0; k <= 100; k++) {
                    int ok = 0;
                    int[] b = {map[0][0] - i, map[1][1] - j, map[2][2] - k};

                    if(i + b[1] == map[0][1])ok++;
                    if(i + b[2] == map[0][2])ok++;
                    if(j + b[0] == map[1][0])ok++;
                    if(j + b[2] == map[1][2])ok++;
                    if(k + b[0] == map[2][0])ok++;
                    if(k + b[1] == map[2][1])ok++;

                    if(ok == 6)ans = true;
                }
            }
        }


        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }



}


