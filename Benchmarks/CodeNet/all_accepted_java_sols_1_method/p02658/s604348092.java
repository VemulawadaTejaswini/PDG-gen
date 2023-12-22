import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] nums = new long[N];
        for(int i=0;i<N;i++) {
            nums[i]=sc.nextLong();
        }
        long border=1000000000000000000l;
        long result=1l;
        for(int i=0;i<N;i++) {
            if(nums[i]==0) {
                System.out.println(0);
                System.exit(0);
            }
        }
        for(int i=0;i<N;i++) {
            if(result>border/nums[i]) {
                System.out.println(-1);
                System.exit(0);
            }else {
                result*=nums[i];
            }
        }
        System.out.println(result);
    }
}
