import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        boolean[] check=new boolean[N];
        
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            check[i]=false;
        }
        
        int target=a[0];
        check[0]=true;
        int ans=1;
        
        while(target!=2){
            ans++;
            if(check[target-1]){
                System.out.println(-1);
                return ;
            }
            check[target-1]=true;
            target=a[target-1];
        }
        
        System.out.println(ans);
    }
}
