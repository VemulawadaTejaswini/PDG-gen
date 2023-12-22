import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    String crlf = System.getProperty("line.separator");
    int row, col, input;
    int sumRow, sumMat;
    int[] sumCol;
    
    row = in.nextInt();
    col = in.nextInt();
    sumCol = new int[col];
    sumMat = 0;
    
    for (int i = 0; i < row; i++) {
      sumRow = 0;
      for (int j = 0; j < col; j++) {
        input =in.nextInt();
        sumRow += input;
        sumCol[j] += input;
        output.append(input).append(" ");
      }
      output.append(sumRow).append(crlf);
    }
    for (int k = 0; k < col; k++) {
      output.append(sumCol[k]).append(" ");
      sumMat += sumCol[k];
    }
    output.append(sumMat);
    System.out.println(output.toString());
  }
}