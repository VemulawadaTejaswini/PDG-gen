import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = sc.nextInt();
        }
        if (array[4] - array[0] > array[5]) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}