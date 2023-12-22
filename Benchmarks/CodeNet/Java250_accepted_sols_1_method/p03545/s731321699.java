import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] nums = in.split("");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);
        int d = Integer.parseInt(nums[3]);

        if (a + b + c + d == 7) {
            System.out.print(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a - b + c + d == 7) {
            System.out.print(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a - b - c + d == 7) {
            System.out.print(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a - b - c - d == 7) {
            System.out.print(a + "-" + b + "-" + c + "-" + d + "=7");
        } else if (a + b - c - d == 7) {
            System.out.print(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a + b + c - d == 7) {
            System.out.print(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a + b - c + d == 7) {
            System.out.print(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a - b + c - d == 7) {
            System.out.print(a + "-" + b + "+" + c + "-" + d + "=7");
        }
    }

}
