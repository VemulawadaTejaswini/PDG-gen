import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for(int i=1;i<=N;i++) a[i] = sc.nextInt();
        boolean[] vis = new boolean[N+1];
        int i=1;
        int cnt=0;
        while(!vis[i]){
            vis[i]=true;
            i=a[i];
            cnt++;
            if(i==2){
                System.out.println(cnt);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
 