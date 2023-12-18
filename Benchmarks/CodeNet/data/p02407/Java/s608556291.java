import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] nums = scan.nextLine().split(" ");

            for (int i = nums.length - 1; i >= 0; i--) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}

