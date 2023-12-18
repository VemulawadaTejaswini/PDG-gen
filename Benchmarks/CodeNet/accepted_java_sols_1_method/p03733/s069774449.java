import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long t=sc.nextInt();
        long[] nums=new long[n+1];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        nums[n]=Long.MAX_VALUE;
        long output=0;
        for(int i=0;i<n;i++){
            output+=Math.min(t, nums[i+1]-nums[i]);
        }
        System.out.println(output);
    }
     
}