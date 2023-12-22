/**
 * TODO: delete this line
 */


import java.util.Scanner;

/**
 * TODO: Rename to Main
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] As = new int[3];
        for (int i = 0; i < 3; i++) {
            As[i] = scanner.nextInt();
        }
        int min = 1000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int h = 0; h < 3; h++) {
                    if (j!= i && h != i && h != j) {
                        int temp = Math.abs(As[i] - As[j]) + Math.abs(As[j] - As[h]);
                        if (temp < min) {
                            min = temp;
                        }
                    }
                }
            }
        }

        System.out.println(min);
    }
}