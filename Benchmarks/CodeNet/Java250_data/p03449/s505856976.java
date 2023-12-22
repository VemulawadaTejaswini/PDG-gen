import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = in.nextInt();

        int[][] array = new int[2][n];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = in.nextInt();

        for (int j = n - 2; j >= 0; j--)
            array[1][j] += array[1][j + 1];
        array[0][n - 1] += array[1][n - 1];
        for (int j = n - 2; j >= 0; j--)
            array[0][j] += Math.max(array[1][j], array[0][j + 1]);
        System.out.println(array[0][0]);
    }
}