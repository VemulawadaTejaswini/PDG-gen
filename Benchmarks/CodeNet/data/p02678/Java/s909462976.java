import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        int[][] route = new int[M][2];
        for(int i=0;i<M;i++){
            route[i][0] = sc.nextInt()-1;   //最後に1を足せ
            route[i][1] = sc.nextInt()-1;
        }

        List<Integer>[] destination = new List[N];
        for(int i=0; i<destination.length; i++) {
            destination[i]= new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++) {
            destination[route[i][0]].add(route[i][1]);
            destination[route[i][1]].add(route[i][0]);
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
            for(int j=0; j<destination[queue.get(i)].size(); j++) {
                if(clear[destination[queue.get(i)].get(j)]==-1) {s
                    queue.add(destination[queue.get(i)].get(j));
                    clear[destination[queue.get(i)].get(j)]=queue.get(i);
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
