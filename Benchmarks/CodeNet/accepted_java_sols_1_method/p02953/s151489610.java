import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i <N ; i++) {
            nums[i]=sc.nextInt();
        }
        for (int i = N-1; i >0 ; i--) {

            if(nums[i-1] > nums[i] ){
                int diff =nums[i-1] - nums[i];
                if(diff>1){
                    System.out.println("No");
                    return;
                }else if(diff==1){
                    nums[i-1]--;
                }
            }
        }
        System.out.println("Yes");
    }
}
