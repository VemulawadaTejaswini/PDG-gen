import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer[] arr = new Integer[num];
        int i = 0;
        while (sc.hasNext()) {
            arr[i++] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        long answer = 0;
        for (i = 1; i < num; i++) {
            answer = answer + arr[i / 2];
        }

        System.out.printf("%d", answer);

    }
}