import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.valueOf(scan.nextLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                sum += (nums[i]*nums[j]);
            }
        }

        System.out.println(sum%(Math.pow(10,9)+7));


    }
}
