import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] c = new int[3][3];
        String result = "Yes";

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = in.nextInt();
            }
        }
        int b1 = c[0][0];
        int b2 = c[1][0];
        int b3 = c[2][0];
        if ((c[0][1] - b1 != c[1][1] -b2) || (c[1][1] -b2 != c[2][1] -b3)){
            result = "No";
        }
        if ((c[0][2] - b1 != c[1][2] -b2) || (c[1][2] -b2 != c[2][2] -b3)){
            result = "No";
        }

        System.out.println(result);
        
        in.close();
    }
}
