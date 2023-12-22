import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i = 0; i < num; i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[num];
        int ansNum = 0;
        for(int i = num-1; i >= 0; i--){
            int sum = 0;
            for(int j = 2 * i + 1; j < num; j += i+1){
                sum += ans[j];
            }

            if(sum%2 == nums[i]){
                ans[i] = 0;
            }else{
                ans[i] = 1;
                ansNum++;
            }
        }

        System.out.println(ansNum);
        if(ansNum != 0){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < num; i++){
                if(ans[i] == 1){
                    sb.append(" ");
                    sb.append(i+1);
                }
            }
            System.out.println(sb.substring(1));
        }
    }
}