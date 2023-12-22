import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int[] list = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(list);
        int add = 2 * list[2] - (list[0] + list[1]);
        int ans = add / 2;
        if (add % 2 == 1) {
            ans += 2;
        }

        System.out.println(ans);
    }
}