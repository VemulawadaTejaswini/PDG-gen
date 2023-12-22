import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []po=new int[n];
        for(int i=0;i<n;i++)po[i]=sc.nextInt();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=1;j<k;j++)
                sum+=po[i+j]-po[i+j-1];
            sum+=Math.min(Math.abs(po[i]),Math.abs(po[i+k-1]));
            ans=Math.min(ans,sum);
        }
        System.out.println(ans);
    }
}
