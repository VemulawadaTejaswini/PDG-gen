import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Grab the row and col data
        int rows = input.nextInt();
        int cols = input.nextInt();

        // build the matrix and add 1 to the cols and rows for the result matrix
        int[][] result = new int[rows +1][cols+1];

        // Create the storage contains for the running total
        int[] colTot = new int[cols]; // only column totals are needed since row totals can be done while read in
        int total = 0;

        // Compute totals in line
        for(int row = 0; row < rows+1; row++) {
            int rowTemp = 0;
            for(int col = 0; col < cols+1; col++){
                // nested if-else structure that handles the three border cases:
                // 1 - on the end of the row
                // 2 - at the bottom of a column
                // 3 - at the bottom right hand corner of the matrix
                // These cases need special handling otherwise grab the next entry from the input and calculate the
                // appropriate values
                if(col == cols && row == rows){
                   result[row][col] = total;
                } else if(col == cols){
                   result[row][col] = rowTemp;
                } else if(row == rows) {
                   result[row][col] = colTot[col];
                } else {
                   // Compute the rest of the values
                   int temp = input.nextInt();
                   total += temp;
                   rowTemp += temp;
                   colTot[col] += temp;
                   result[row][col] = temp;
                }
            }
        }
        // display output
        showSheet(result);

    }

    private static void showSheet(int[][] result){
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j]);
                if( j < result[0].length - 1) System.out.print(" ");
            }
 System.out.print("\n");
        }
    }
}

