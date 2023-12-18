import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        Scanner inp = new Scanner(System.in);

        int total = 0;

        int end = 1;
        while (end != 0) {
            int num1 = inp.nextInt();
            int num2 = inp.nextInt();

            if (num1 == 0 && num2 == 0) {
                end = 0;
            } else {
                row.add(num1);
                col.add(num2);

                total++;
            }
        }

        for (int i = 0; i < total; i++) {
            int ro = row.get(i);
            int co = col.get(i);

            for (int r = 0; r < ro; r++) {
                for (int c = 0; c < co; c++) {
                    if (c == 0 || c == co-1 || r == 0 || r == ro-1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }

                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}

