import java.util.Scanner;
public class Main {
    public static int n;
    public static int a[];
    public static int q;
    public static int m[];
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        q = sc.nextInt();
        m = new int[q];
        for(int i=0;i<q;i++){
            m[i] = sc.nextInt();
        }
        for(int k: m){
            if(dfs(0, 0, k)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }        
        sc.close();

    }
    public static boolean dfs (int i, int sum, int k){
        if(i == n){
            return sum == k;
        }
        if(dfs(i+1,sum,k)){
            return true;
        }
        if(dfs(i+1,sum + a[i], k)){
            return true;
        }
        return false;
    }
}
