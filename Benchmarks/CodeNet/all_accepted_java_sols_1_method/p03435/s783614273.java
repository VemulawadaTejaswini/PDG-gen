import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int[][] grid = new int[3][3];
                int i,j;
                for(i=0;i<3;i++){
                        for(j=0;j<3;j++){
                                grid[i][j] = sc.nextInt();
                        }
                }
                boolean check = true;
                boolean[] a,b;
                a = new boolean[3];
                b = new boolean[3];
                a[0] = (grid[0][0] - grid[1][0]) == (grid[0][1] - grid[1][1])
                        && (grid[0][1] - grid[1][1]) == (grid[0][2] - grid[1][2])
                        && (grid[0][0] - grid[1][0]) == (grid[0][2] - grid[1][2]);

                a[1] = (grid[1][0] - grid[2][0]) == (grid[1][1] - grid[2][1])
                        && (grid[1][1] - grid[2][1]) == (grid[1][2] - grid[2][2])
                        && (grid[1][0] - grid[2][0]) == (grid[1][2] - grid[2][2]);

                a[2] = (grid[2][0] - grid[0][0]) == (grid[2][1] - grid[0][1])
                        && (grid[2][1] - grid[0][1]) == (grid[2][2] - grid[0][2])
                        && (grid[2][0] - grid[0][0]) == (grid[2][2] - grid[0][2]);

                b[0] = (grid[0][0] - grid[0][1]) == (grid[1][0] - grid[1][1])
                        && (grid[1][0] - grid[1][1]) == (grid[2][0] - grid[2][1])
                        && (grid[0][0] - grid[0][1]) == (grid[2][0] - grid[2][1]);

                b[1] = (grid[0][1] - grid[0][2]) == (grid[1][1] - grid[1][2])
                        && (grid[1][1] - grid[1][2]) == (grid[2][1] - grid[2][2])
                        && (grid[0][1] - grid[0][2]) == (grid[2][1] - grid[2][2]);

                b[2] = (grid[0][2] - grid[0][0]) == (grid[1][2] - grid[1][0])
                        && (grid[1][2] - grid[1][0]) == (grid[2][2] - grid[2][0])
                        && (grid[0][2] - grid[0][0]) == (grid[2][2] - grid[2][0]);

                if(a[0] && a[1] && a[2] && b[0] && b[1] && b[2]){
                        System.out.print("Yes");
                }else{
                        System.out.print("No");
                }
        }
}