import java.util.Scanner;
public class Main {
    public static int n;
    public static int A[];
    public static int q;
    public static int M[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n+1];
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }
        q = sc.nextInt();
        M = new int[q+1];
        for(int i = 0; i < q;i++){
            M[i]= sc.nextInt();
        }
        for(int i = 0;i < q; i++){
            if(dfs(0,0,M[i])) System.out.println("yes");
            else System.out.println("no");            
        }
        sc.close();
    }

    private static boolean  dfs(int i,int sum,int ans){
        if (i==n) return sum == ans;
        if(dfs(i+1,sum,ans)) return true;
        if(dfs(i+1,sum+A[i],ans)) return true;
        return false;
    }
}

