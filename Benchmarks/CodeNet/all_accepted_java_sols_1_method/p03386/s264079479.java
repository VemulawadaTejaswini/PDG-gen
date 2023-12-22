import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int A = Integer.parseInt(array[0]);
            int B = Integer.parseInt(array[1]);
            int K = Integer.parseInt(array[2]);

            if (A + K >= B - K + 1) {
                for (int i = A; i <= B; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = A; i < A + K; i++) {
                    System.out.println(i);
                }
                for (int i = B - K + 1; i <= B; i++) {
                    System.out.println(i);
                }
            }
        }
    }
}