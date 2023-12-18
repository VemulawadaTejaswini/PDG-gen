import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] tree = new int[n];
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++)
            tree[i] = sc.nextInt();
        Arrays.sort(tree);
        
        for(int i = 0;i < n-k+1;i++){
            int max = tree[i+k-1] , min = tree[i];
            
            ans = Math.min(ans,max-min);
        }

        System.out.println(ans);
    }
}