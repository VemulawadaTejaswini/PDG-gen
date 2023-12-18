import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        int[][] route = new int[M][2];
        for(int i=0;i<M;i++){
            route[i][0] = sc.nextInt()-1;   //最後に1を足せ
            route[i][1] = sc.nextInt()-1;
        }
        int[] ans = new int[N];
        for(int i=0;i<N;i++){
            ans[i] = -1;
        }
        ans[0] = 0;
        List<Integer>[] destination = new List[N];
        for(int i=0;i<N;i++){
            destination[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            destination[route[i][0]].add(route[i][1]);
            destination[route[i][1]].add(route[i][0]);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        int count = 1;
        while(!queue.isEmpty() && count < N){
            int iter = queue.poll();
            for(int i : destination[iter]){
                if(ans[i] == -1) {
                    ans[i] = iter;
                    queue.add(i);
                    count++;
                }
            }
        }
 
        boolean flag = false;
        for(int i=0;i<N;i++){
            if(ans[i] == -1){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("No");
        }else{
            for(int i=0;i<N;i++) {
                System.out.println(i == 0 ? "Yes" : ans[i]+1);
            }
        }
    }
}