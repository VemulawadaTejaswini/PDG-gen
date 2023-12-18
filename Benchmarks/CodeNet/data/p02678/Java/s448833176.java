package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D168 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        int[][] route = new int[M][2];
        for(int i=0;i<M;i++){
            route[i][0] = sc.nextInt()-1;   //最後に1を足せ
            route[i][1] = sc.nextInt()-1;
        }

        int[] clear = new int[N];
        for(int i=0; i<clear.length; i++) {
            if(i!=0) {
                clear[i]=-1;
            }
        }

        List<Integer> queue = new ArrayList<Integer>();
        queue.add(0);

        for(int i=0; i<queue.size(); i++) {
            for(int j=0; j<M; j++) {
                if(route[j][0]==queue.get(i) && clear[route[j][1]]==-1) {
                    queue.add(route[j][1]);
                    clear[route[j][1]]=route[j][0];
                }
                if(route[j][1]==queue.get(i) && clear[route[j][0]]==-1) {
                    queue.add(route[j][0]);
                    clear[route[j][0]]=route[j][1];
                }
            }
        }
        if(queue.size()==N) {
            System.out.println("Yes");
        }
        for(int i=1; i<clear.length; i++) {
            System.out.println(clear[i]+1);
        }
    }

}
