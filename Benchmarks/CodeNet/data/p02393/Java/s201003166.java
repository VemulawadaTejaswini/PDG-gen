import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]); 
    }
}