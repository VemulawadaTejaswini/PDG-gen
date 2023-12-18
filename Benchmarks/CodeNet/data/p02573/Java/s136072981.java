import java.util.Scanner;

/**
 * @author kep
 * @date 2019-10-17
 */
public class Main {

    private static  int[] parent  = new int[200005];
    private static  int[] count = new int[200005];
    private static int findRoot(int x){
        if(parent[x] == 0){
            return x;
        }
        parent[x] = findRoot(parent[x]);
        return parent[x];
    }

    private static void add(int a,int b){
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
        for(int i = 0;i<m;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int root_a = findRoot(a);
            int root_b = findRoot(b);
            add(root_a,root_b);
        }
        int ans = 0;
        for(int i = 1;i<=n;i++){
            int root_i = findRoot(i);
            count[root_i]++;
            ans = Math.max(count[root_i],ans);
        }
        System.out.println(ans);

    }



}
