import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int A = Integer.parseInt(abt[0]);
        int B = Integer.parseInt(abt[1]);

        boolean isMatch = false;
        for (int i = 0; i < Math.max(A, B); i++) {

            if (Math.abs(A - i) == Math.abs(B - i)) {
                System.out.println(i);
                isMatch = true;
            }
        }
        if (!isMatch) {
            System.out.println("IMPOSSIBLE");

        }
    }

}
