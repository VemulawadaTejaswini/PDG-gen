import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).sorted().toArray();
        double prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];
            prev = (prev + next) / 2.0;
        }
        System.out.println(prev);
    }
}