import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int[] antenna = new int[5];
        int min = 0, max = 0;
        for (int i = 0; i < antenna.length; i++) {
            antenna[i] = Integer.parseInt(sc.next());
            if (i == 0) {
                min = antenna[i];
                max = antenna[i];
            } else {
                min = Math.min(min, antenna[i]);
                max = Math.max(max, antenna[i]);
            }
        }
        int k = Integer.parseInt(sc.next());
        int diff = max - min;

        if (diff <= k) {
            System.out.print("Yay!");
        } else {
            System.out.print(":(");
        }
    }
}