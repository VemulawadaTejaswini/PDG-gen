import java.util.Arrays;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        for (int c = 0; c < 3; c++) {
            nums[c] = sc.nextInt();
        }

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
        sc.close();
    }

}
