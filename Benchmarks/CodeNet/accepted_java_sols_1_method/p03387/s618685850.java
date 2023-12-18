import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int A = Integer.parseInt(array[0]);
            int B = Integer.parseInt(array[1]);
            int C = Integer.parseInt(array[2]);

            int sumDiff = 0;
            if (A < B) {
                if (B < C) {
                    // max is C
                    sumDiff = C - A + C - B;
                } else {
                    // max is B
                    sumDiff = B - A + B - C;
                }
            } else if (A < C) {
                // max is C
                sumDiff = C - A + C - B;
            } else {
                // max is A
                sumDiff = A - B + A - C;
            }

            if ((sumDiff & 1) == 1) {
                sumDiff += 3;
            }
            System.out.println(sumDiff / 2);
        }
    }
}