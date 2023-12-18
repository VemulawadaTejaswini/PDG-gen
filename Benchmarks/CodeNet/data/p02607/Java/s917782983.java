import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] a = new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        for (int i=1;i<=n;i++)if (i%2==1&&a[i-1]%2==1)ans++;
        System.out.println(ans);
    }
}
