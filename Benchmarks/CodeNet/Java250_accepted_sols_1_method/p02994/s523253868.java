import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int check = 999999;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());

        for (int i = 0 ; i < n ; i ++) {
            if (Math.abs(l + i) < Math.abs(check)) {
                check = l + i;
            }
            sum += l + i;
        }
        sum -= check;
        System.out.print(sum);

    }
}
