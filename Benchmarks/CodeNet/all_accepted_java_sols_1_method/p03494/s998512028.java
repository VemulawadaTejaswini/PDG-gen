import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        loop: while (true) {
            for (int i = 0; i < n; i++) {
                int num=nums[i];
                if(num%2==0){
                    nums[i] = num/2;
                }else{
                    break loop;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}