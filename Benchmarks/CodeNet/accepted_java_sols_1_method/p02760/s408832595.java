import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[3][3];
        for (int i = 0; i < 3; i ++)
            for (int j = 0; j < 3; j ++)
                nums[i][j] = scan.nextInt();
        int n = scan.nextInt();
        boolean[][] found = new boolean[3][3];
       // int ans = 0;
        for (int k = 0; k < n; k ++){
            int t = scan.nextInt();
            for (int i = 0; i < 3; i ++){
                for (int j  = 0; j < 3; j ++){
                    if (nums[i][j] == t){
                       // ans ++;
                        found[i][j] = true;
                    }
                }
            }
        }
        if ((found[0][0] && found[0][1] && found[0][2]) || (found[1][0] && found[1][1] && found[1][2]) || (found[2][0] && found[2][1] && found[2][2])
        || (found[0][0] && found[1][0] && found[2][0]) || (found[0][1] && found[1][1] && found[2][1]) || (found[0][2] && found[1][2] && found[2][2])
        || (found[0][0] && found[1][1] && found[2][2]) || (found[0][2] && found[1][1] && found[2][0]))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
