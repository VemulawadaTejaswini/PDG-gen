import java.util.Scanner;

/**
 * @author kep
 * @date 2019-10-17
 */
public class Main {

    private static int findRoot(int[] parent,int x){
        if(parent[x] == 0){
            return x;
        }
        parent[x] = findRoot(parent,parent[x]);
        return parent[x];
    }

    private static void add(int[] parent,int a,int b){
        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] parent  = new int[n+1];
        boolean[] vis2 = new boolean[n+1];
        for(int i = 0;i<m;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int root_a = findRoot(parent,a);
            int root_b = findRoot(parent,b);
            add(parent,root_a,root_b);
        }
        int ans = 0;
        boolean flag = true;
        for(int i = 1;i<=n;i++){
            if(vis2[i])continue;
            for(int j = i+1;j<=n;j++){
                int root = findRoot(parent,j);
                if(root != findRoot(parent,i)){
                    vis2[j] = true;
                }
            }
            ans++;
        }
        System.out.println(ans);

    }



}
