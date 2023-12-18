import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = {in.nextInt(), in.nextInt()};

        while (!(arr[0] == 0 && arr[1] == 0)) {
            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[1]);

            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
        }

        System.exit(0);
    }
}

