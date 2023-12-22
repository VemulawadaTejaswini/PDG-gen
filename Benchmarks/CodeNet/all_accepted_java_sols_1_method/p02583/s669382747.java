import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int nums[] = new int[total];
        sc.nextLine();
        for (int a=0; a<total; a++) {
            nums[a] = sc.nextInt();
        }
        int result = 0;
        int count = nums.length;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    if(nums[i] + nums[j] > nums[k]
                        && nums[k] + nums[i] > nums[j]
                        && nums[j] + nums[k] > nums[i]
                        && nums[i] != nums[j]
                        && nums[j] != nums[k]
                        && nums[k] != nums[i]) {
                            result++;
                    }
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}