import java.util.*;

public class Main {
    private static int[] numbers;
    private static Stack<Integer> stackB;
    private static Stack<Integer> stackC;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // remove empty line
        for (int i = 0; i < N; i++) {
            numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            stackB = new Stack<>();
            stackC = new Stack<>();

            System.out.println(dfs(0) ? "YES" : "NO");
        }
    }

    private static boolean dfs(int ind) {
        if (ind == 10) return true; // last element;

        int topB, topC;
        if (stackB.empty()) {
            topB = 0;
        } else {
            topB = stackB.peek();
        }
        if (stackC.empty()) {
            topC = 0;
        } else {
            topC = stackC.peek();
        }

        int num = numbers[ind];
        if (topB < num && topC < num) {
            if (topB > topC) {
                stackB.push(num);
                return dfs(ind+1);
            } else {
                stackC.push(num);
                return dfs(ind+1);
            }
        } else if (topB < num) {
            stackB.push(num);
            return dfs(ind+1);
        } else if (topC < num) {
            stackC.push(num);
            return dfs(ind+1);
        }

        return false;
    }
}