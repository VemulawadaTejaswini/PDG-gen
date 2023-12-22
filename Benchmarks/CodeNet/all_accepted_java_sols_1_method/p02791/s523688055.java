import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=1;
        Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt(),b=sc.nextInt();
        int n=Integer.parseInt(sc.next());
        //  String s=sc.next();
        int[] p = new int[n];
        int[] min = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        min[0]=p[0];
        for(int i=1;i<n;i++){
            min[i]=Math.min(min[i-1],p[i]);
        }
        for(int i=1;i<n;i++){
            if(p[i]<min[i-1])ans++;
        }

        System.out.println(ans);

    }

}
