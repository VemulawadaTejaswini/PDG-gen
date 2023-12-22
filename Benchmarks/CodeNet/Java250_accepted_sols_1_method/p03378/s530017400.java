import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,M,X,cost_r=0,cost_l=0;
        N=sc.nextInt();
        M=sc.nextInt();
        X=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int [] cost = new int[N];
        for(int a=0;a<N;a++){
            cost[a]=0;
        }
        for(int a=0;a<M;a++){
            int num=sc.nextInt();
            cost[num] =1;
        }
        for(int a=1;a<N-1;a++){
            if(X-a>=0){
                cost_l += cost[X-a];
            }
            if(X+a<=N-1){
                cost_r+=cost[X+a];
            }
        }
        if(cost_r>=cost_l) System.out.println(cost_l);
        else System.out.println(cost_r);
    }
}