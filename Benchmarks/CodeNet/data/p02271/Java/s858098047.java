import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N=new int[n];

    for(int i = 0; i < n; i ++){
        N[i] = sc.nextInt();
        }

    int q = sc.nextInt();
    for(int i = 0; i < q ; i ++){
        int x = sc.nextInt();
            boolean flag = solve(N,0,x);
            System.out.println(flag ? "yes" : "no");
        }
    }

    static boolean solve(int[] N,int k,int m){
        if(m == 0) return true;
        if(m < 0 || k >= N.length) return false;
        return solve(N,k + 1,m - N[k]) || solve(N,k + 1,m);
    }
}
