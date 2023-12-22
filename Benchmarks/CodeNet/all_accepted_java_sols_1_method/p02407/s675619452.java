import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int count = Integer.parseInt(scan.nextLine());
            String[] nums = scan.nextLine().split(" ");

            for (int i = (count - 1); i > 0; i--) {
                System.out.print(nums[i] + " ");
            }
            System.out.println(nums[0]);
        }
    }
}

