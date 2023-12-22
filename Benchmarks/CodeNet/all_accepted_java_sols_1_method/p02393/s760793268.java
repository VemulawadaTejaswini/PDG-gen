import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };

        Arrays.sort(arr);

        System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
    }
}
