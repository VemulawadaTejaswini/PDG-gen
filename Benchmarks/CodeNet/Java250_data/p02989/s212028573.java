import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);

        int half = array.length / 2;

        if (array[half - 1] == array[half]) {

            System.out.println(0);
            return;
        }

        int ans = 0;
        System.out.println(array[half] - array[half - 1]);

    }
}