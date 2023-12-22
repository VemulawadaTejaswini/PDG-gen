import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i=0;i<n;i++)h[i]=sc.nextInt();
        int ans = 0;
        for (int i=0;i<n;i++){
            int count = i;
            while (count<n-1&&h[count]>=h[count+1])count++;
            ans=Math.max(ans,count-i);
        }
        System.out.println(ans);
    }
}
