
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i=0; i<N; i++) {
            values.add(scanner.nextInt());
        }

        values.sort(Comparator.comparingInt(o -> o));
        Stack<Integer> stack = new Stack<>();
        stack.addAll(values);
        int aliceSum = 0;
        int bobSum = 0;

        while (!stack.empty()) {
            aliceSum += stack.pop();
            if (stack.empty()) break;
            bobSum += stack.pop();
        }
        System.out.println(aliceSum - bobSum);
    }
}