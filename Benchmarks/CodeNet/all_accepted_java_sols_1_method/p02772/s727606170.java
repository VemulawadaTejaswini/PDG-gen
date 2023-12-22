import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int num;
        boolean approved = true;
        num = cin.nextInt();

        int temp;
        for (int i = 0; i < num; i++) {
            temp = cin.nextInt();
            if (temp % 2 == 0) {
                if (!(temp % 3 == 0 || temp % 5 == 0)) {
                    approved = false;
                }
            }
        }

        if (approved) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}
