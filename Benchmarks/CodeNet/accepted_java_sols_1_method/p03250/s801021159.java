/*abc110a*/
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        Arrays.sort(arr);

        int max = arr[2]*10+arr[1]+arr[0];

        out.println(max);
        out.flush();
    }
}
