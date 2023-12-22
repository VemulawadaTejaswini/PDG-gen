import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int sum = 0;
        int count = 1;
        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            sum += val;
            if (sum > X) {
                break;
            }
            count++;
        }
        sc.close();

        System.out.println(count);

    }

}
