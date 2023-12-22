import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<>();

        int rows = inp.nextInt();
        int columns = inp.nextInt();

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

        for (int i = 0; i < rows; i++){
            ArrayList<Integer> numberRow = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                numberRow.add(inp.nextInt());
            }
            numbers.add(numberRow);
        }

        output(numbers, rows, columns);
    }

    public static void output (ArrayList<ArrayList<Integer>> numbers, int rows, int columns) {
        int totalTotal = 0;

        ArrayList<Integer> totalCol = new ArrayList<>();

        for (int i = 0; i < columns; i++) {
            totalCol.add(0);
        }

        for (int i = 0; i < rows; i++){
            int total = 0;
            for (int j = 0; j < columns; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }

                int n = numbers.get(i).get(j);
                System.out.print(n);

                total += n;

                int colTol = totalCol.get(j);
                totalCol.remove(j);
                totalCol.add(j, colTol+n);
            }

            System.out.print(" " + total);

            totalTotal += total;
            total = 0;

            System.out.print("\n");
        }

        for (int i : totalCol) {
            System.out.print(i + " ");
        }

        System.out.print(totalTotal + "\n");
    }
}

