import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner stdId = new Scanner(System.in);
        int a;
        int cnt = 0;

        while (true) {
            a = stdId.nextInt();
            if (a == 0) {
                break;
            } else {
                cnt++;
                System.out.println("Case " + cnt + ": " + a);
                //Case 1: 3
            }
        }
    }
}