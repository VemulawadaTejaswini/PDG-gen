import java.util.*;

public class Main {
    public static void main(String[] aregs) {
        Scanner sc = new Scanner(System.in);
        int[] imput = new int[4];

        for (int i = 0; i <= 3; i++) {
            imput[i] = sc.nextInt();;
        }

        int left_sum = imput[0] + imput[1];
        int right_sum = imput[2] + imput[3];

        if (left_sum > right_sum) {
            System.out.println("Left");
        } else if (left_sum == right_sum) {
            System.out.println("Balanced");
        } else {
            System.out.println("Right");
        }
    }
}