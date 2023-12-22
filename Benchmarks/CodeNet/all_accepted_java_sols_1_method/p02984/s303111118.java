
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        long[] nums=new long[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            sum+=nums[i];
        }
        long[] sums=new long[n*2];
        sums[0]=nums[0];
        for(int i=1;i<n;i++){
            sums[i]=sums[i-1]+nums[i*2%n];
        }
        for(int i=0;i<n;i++){
            sums[n+i]=sums[n+i-1]+nums[i*2%n];
        }
        for(int i=0;i<n;i++){
            if(i%2==1){
                System.out.print(sum-(sums[(i+n)/2+n-1]-sums[(i+n)/2+n-n/2-1])*2+" ");
            }else{
                System.out.print(sum-(sums[i/2+n-1]-sums[i/2+n-n/2-1])*2+" ");
            }
        }
        System.out.println();
    }
}
