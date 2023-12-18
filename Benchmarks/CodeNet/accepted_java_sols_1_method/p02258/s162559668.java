import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rowCount = Integer.parseInt(sc.nextLine());

        int minNum = Integer.parseInt(sc.nextLine());
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < rowCount; i++) {

            int num = Integer.parseInt(sc.nextLine());

            maxProfit = Math.max(maxProfit, num - minNum);
            minNum = Math.min(minNum, num);

            // System.out.printf("num:%3d, minNum:%3d, profit:%3d\n", num, minNum, maxProfit);
        }

        System.out.println(maxProfit);
    }
    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     int N = Integer.parseInt(sc.nextLine());

    //     int[] nums = new int[N];
    //     for(int i=0; i<N; i++) {
    //         // int a = Integer.parseInt(sc.nextLine());
    //         int a = sc.nextInt();
    //         nums[i] = a;
    //     }

    //     int maxProfit = Integer.MIN_VALUE;
    //     for (int i = 1; i < nums.length; i++) {
    //         for (int j = 0; j < i; j++) {
    //             // System.out.printf("%d %d -> %d\n", nums[i], nums[j], nums[i] - nums[j]);

    //             maxProfit = Math.max(maxProfit, nums[i] - nums[j]);
    //         }
    //     }


    //     System.out.println(maxProfit);
    // }
}
