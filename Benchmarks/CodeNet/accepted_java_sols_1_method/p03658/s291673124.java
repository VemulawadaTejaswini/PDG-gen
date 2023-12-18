import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)
        {
            l[i] = scan.nextInt();
        }
        int ans = 0;
        
        Arrays.sort(l);
        while(k>0)
        {
            ans+=l[n-k];
            k--;
        }
        System.out.println(ans);
    }
}
