import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < k; i++) {
            sb.append(x - (k-i)).append(" ");
        }
        sb.append(x).append(" ");
        for (int i = 1; i < k; i++) {
            sb.append(x + i).append(" ");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
