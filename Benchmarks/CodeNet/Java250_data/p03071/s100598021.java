import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        int a = Integer.valueOf(tmp[0]);
        int b = Integer.valueOf(tmp[1]);
        int sum = judge(a, b);

        if (a < b) {
            b--;
        } else {
            a--;
        }
        sum += judge(a, b);
        System.out.println(sum);
    }

    public static int judge(int a, int b) {
        int res = 0;
        if (a < b) {
            res = b;
        } else {
            res = a;
        }
        return res;
    }
}
