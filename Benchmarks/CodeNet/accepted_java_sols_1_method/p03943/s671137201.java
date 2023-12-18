import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candies = new int[3];
        for (int i = 0; i < 3; i++) {
            candies[i] = sc.nextInt();
        }
        Arrays.sort(candies);

        if (candies[0] + candies[1] == candies[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
