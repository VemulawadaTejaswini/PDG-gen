import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) nums[i]=sc.nextInt();

        //sort
        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        // + Max  - min  and middle |abs|
        int max =nums[nums.length-1];
        int min =nums[0];
        int ans = min;
        for (int i = 1; i <= nums.length-2 ; i++) {// minus all positive except max
            if(nums[i]>=0){
                sb.append(ans+" "+nums[i]+"\n");
                ans = ans - nums[i];
            }
        }
        sb.append(max+" "+ans+"\n");
        ans = max - ans;
        for (int i = 1; i <= nums.length-2 ; i++) {// minus all positive except max
            if(nums[i]<0){
                sb.append(ans+" "+nums[i]+"\n");
                ans = ans - nums[i];
            }
        }

        System.out.println(ans);
        System.out.println(sb.toString());
    }

}
