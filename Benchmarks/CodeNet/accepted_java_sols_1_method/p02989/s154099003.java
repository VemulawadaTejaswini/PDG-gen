import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        if(nums[N/2-1] == nums[N/2]){
            System.out.println(0);
        }else{
            System.out.println(nums[N/2]-nums[N/2-1] );
        }


    }

}
