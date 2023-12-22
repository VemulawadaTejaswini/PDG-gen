import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int amount = (a-1) * 2 + 1;
        int ans = b - (a-1);

        for (int i = 0; i < amount; i++) {
            System.out.print(ans + " ");
            ans++;
        }
    }
}
