import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            min = Math.min(min,x[i]);
            max = Math.max(max,x[i]);
        }

        int mincost = Integer.MAX_VALUE;
        for(int i=min;i<max+1;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=Math.pow(i-x[j],2);
            }
            mincost=Math.min(mincost,sum);
        }
        System.out.println(mincost);


    }

}