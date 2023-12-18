import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3));
        result.removeIf(val -> val == a || val == b);

        // 出力
        System.out.println(result.get(0));
    }
}