
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for (int i=0; i < M; i++) {
            leftList.add(scanner.nextInt());
            rightList.add(scanner.nextInt());
        }

        int left = Collections.max(leftList);
        int right = Collections.min(rightList);

        int result = Math.min(right, N) - Math.max(left, 1) + 1;
        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }
}