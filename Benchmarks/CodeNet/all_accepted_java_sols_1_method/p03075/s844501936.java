import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coordinates = new int[5];

        for (int i=0; i<5; i++) {
            coordinates[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (coordinates[4] - coordinates[0] <= k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
