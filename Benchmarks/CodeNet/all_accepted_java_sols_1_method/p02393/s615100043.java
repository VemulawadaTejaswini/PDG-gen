import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        int tmp = 0;
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 0; flag; i++) {
            flag = false;
            for (int j = 2; j >= i + 1; j--) {
                if (nums[j] < nums[j - 1]) {
                    tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.printf("%d", nums[i]);
        }
        System.out.print("\n");
    }
}

