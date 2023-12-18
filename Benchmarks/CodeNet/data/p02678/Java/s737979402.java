import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ans  = new int[N+1];

        Set[] connectSet = new Set[N+1];

        for(int i=0;i<N+1;i++){
            connectSet[i] = new HashSet();
            ans[i] = 0;
        }

        for(int i=0;i<M;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            connectSet[A].add(B);
            connectSet[B].add(A);
        }

        Queue<DataSet> que = new ArrayDeque<>();
        que.add(new DataSet(1,connectSet[1]));

        while(!que.isEmpty()){
            DataSet ds = que.poll();
            System.out.println(ds.i);

            for(Iterator it = ds.S.iterator(); it.hasNext(); ) {
                int i = (int)it.next();
                if(ans[i] == 0){
                    ans[i] = ds.i;
                    que.add(new DataSet(i,connectSet[i]));
                }
            }
        }

        for(int i=2;i<N+1;i++){
            if(ans[i] == 0){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
        for(int i=2;i<N+1;i++){
            System.out.println(ans[i]);
        }

    }

}

class DataSet {

    int i;
    Set S;

    public DataSet(int i,Set S){
        this.i = i;
        this.S = S;
    }
}








