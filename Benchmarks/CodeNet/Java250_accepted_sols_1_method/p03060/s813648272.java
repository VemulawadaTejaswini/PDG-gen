import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] v = sc.nextLine().split(" ");
        String[] c = sc.nextLine().split(" ");

        int ret = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(v[i]) - Integer.parseInt(c[i]);
            if (tmp > 0) {
                ret += tmp;
            }
        }

        System.out.println(ret);
    }
}