import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        int result = 0;

        for (int i = 0; i < num; i++) {
            int target = Integer.parseInt(sc.nextLine());

            if (target == 1) { continue; }

            boolean flgPrime = true;
            for(int j = 2; j <= (int)Math.sqrt(target); j++) {
                if (target % j == 0) {
                    flgPrime = false;
                    break;
                }
            }

            if (flgPrime) {
                result++;
            }
        }

        System.out.println(result);
    }
}
