import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int sumOfRow;
        int[] sumOfCol = new int[col + 1];
        String line;
        int i, j, num;
        for (i = 0; i < col + 1; i++) {
            sumOfCol[i] = 0;
        }
        for (i = 0; i < row; i++) {
            line = br.readLine();
            input = line.split(" ");

            sumOfRow = 0;

            for (j = 0; j < col; j++) {
                num = Integer.parseInt(input[j]);
                sumOfRow += num;
                sumOfCol[j] += num;
            }

            sumOfCol[col] += sumOfRow;

            System.out.println(line + " " + sumOfRow);

        }
        line = "";
        for (i = 0; i < col + 1; i++) {
            line += sumOfCol[i];
            if (i == col) break;
            line += " ";
        }
        System.out.println(line);
    }
}