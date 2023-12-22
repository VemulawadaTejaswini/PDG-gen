import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long minR,maxR;
        minR = (long)Math.pow(10,9)+1;
        maxR = -1;
        n = input.nextInt();
        long[] min = new long[n];
        long[] max = new long[n];
        long[] R = new long[n];
        for (int i = 0; i < n; i++){
            R[i] = input.nextLong();
            minR = Math.min(R[i],minR);
            min[i] = minR;
        }
        for (int i = n-1; i > -1; i--){
            maxR = Math.max(R[i],maxR);
            max[i] = maxR;
        }
        long ans;
        ans = -(long)Math.pow(10,9)-1;
        for (int i = 0; i < n-1; i++){
            ans = Math.max(ans,max[i+1]-min[i]);
        }
        System.out.println(ans);
    }
}
