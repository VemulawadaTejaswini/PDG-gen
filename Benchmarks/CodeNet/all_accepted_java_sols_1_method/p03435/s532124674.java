import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){


        int H,W,D;
        int count =0;
        Scanner input = new Scanner(System.in);
        String Ans = "Yes";
        int [][] arr = new int[4][4];

        for (int i=1; i<=3; i++ ) {
                for (int j=1; j<=3; j++ ) {
                        arr[i][j] = input.nextInt();
                }
        }

        if (arr[1][1]-arr[2][1] != arr[1][2]-arr[2][2] || arr[1][2]-arr[2][2] != arr[1][3]-arr[2][3]) {
                //a1 - a2
                Ans = "No";
        }else if (arr[2][1]-arr[3][1] != arr[2][2]-arr[3][2] || arr[2][2]-arr[3][2] != arr[2][3]-arr[3][3]) {
                //a2 - a3
                Ans = "No";
        }else if (arr[3][1]-arr[1][1] != arr[3][2]-arr[1][2] || arr[3][2]-arr[1][2] != arr[3][3]-arr[1][3]) {
                //a3 - a1
                Ans = "No";
        }else if (arr[1][1]-arr[1][2] != arr[2][1]-arr[2][2] || arr[2][1]-arr[2][2] != arr[3][1]-arr[3][2]) {
                //b1 - b2
                Ans = "No";
        }else if (arr[1][2]-arr[1][3] != arr[2][2]-arr[2][3] || arr[2][2]-arr[2][3] != arr[3][2]-arr[3][3]) {
                //b2 - b3
                Ans = "No";
        }else if (arr[1][3]-arr[1][1] != arr[2][3]-arr[2][1] || arr[2][3]-arr[2][1] != arr[3][3]-arr[3][1]) {
                //b3 - b1
                Ans = "No";
        }

        System.out.println(Ans);
}
}
