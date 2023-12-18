import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = (x - 2 * z) / (y + z);
        if ((x - 2 * z) - sum * (y + z) >= y)
            System.out.println(sum + 1);
        else
            System.out.println(sum);

    }
}
