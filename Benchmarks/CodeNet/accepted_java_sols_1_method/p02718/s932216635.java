import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int ans = 0;
        int sum = 0;
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
            sum = sum + A[i];
        }
        double san = 1 / (4 * (double)M);
        for(int j=0;j<N;j++)
        {
            if(A[j]>=san*sum)
            {
                ans++;
            }
        }
        if(ans>=M)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
