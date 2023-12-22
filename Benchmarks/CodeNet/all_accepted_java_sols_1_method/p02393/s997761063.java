import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        System.exit(0);
    }
}

