import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] nums = new int[num];
        int max = 0;
        int second = 0;
        for(int i = 0; i < num; i++){
            nums[i] = sc.nextInt();
            if(nums[i] >= max){
                second = max;
                max = nums[i];
            }else if(nums[i] > second){
                second = nums[i];
            }
        }

        int ans;
        for(int i = 0; i < num; i++){
            if(nums[i] == max)ans = second;
            else ans = max;
            System.out.println(ans);
        }

    }
}