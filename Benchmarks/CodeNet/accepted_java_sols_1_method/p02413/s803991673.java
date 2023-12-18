import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int sum_row = 0, sum_col = 0;
        int[][] new_table = new int[row + 1][col + 1];
        for (int i = 0; i < new_table.length - 1; i ++ )
            for (int j = 0; j < new_table[0].length - 1; j ++ )
                new_table[i][j] = input.nextInt();
                
        for (int i = 0; i < new_table.length; i ++ ) {
            int sum = 0;
            for (int j = 0; j < new_table[0].length; j ++ )
                sum += new_table[i][j];
            new_table[i][new_table[0].length - 1] = sum;
        }
        
        for (int i = 0; i < new_table[0].length; i ++ ) {
            int sum = 0;
            for (int j = 0; j < new_table.length; j ++ )
                sum += new_table[j][i];
            new_table[new_table.length-1][i] = sum;
        }
        
        for (int i = 0; i < new_table.length; i ++ ) {
            System.out.print(new_table[i][0]);
            for (int j = 1; j < new_table[0].length; j ++ )
                System.out.print(" " + new_table[i][j]);
            System.out.println();
        }
    }
}
