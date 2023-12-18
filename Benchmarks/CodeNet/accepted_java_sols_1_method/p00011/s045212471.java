import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int varticalCount = sc.nextInt();
        int horizontalCount = sc.nextInt();

        int[] nums = new int[varticalCount];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        String swapIndexs;
        int commaIndex;
        int swapIndex1, swapIndex2;
        int dummy;
        for (int i = 0; i < horizontalCount; i++) {
            swapIndexs = sc.next();
            commaIndex = swapIndexs.indexOf(",");
            swapIndex1 = Integer.parseInt(swapIndexs.substring(0, commaIndex)) - 1;
            swapIndex2 = Integer.parseInt(swapIndexs.substring(commaIndex + 1)) - 1;

            dummy = nums[swapIndex1];
            nums[swapIndex1] = nums[swapIndex2];
            nums[swapIndex2] = dummy;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        sc.close();
    }
}
