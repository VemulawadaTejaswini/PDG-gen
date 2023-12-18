import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> children = new ArrayList<>(N);
        for(int i = 0 ; i < N ; i++){
            children.add(new ArrayList<Integer>());
        }
        
        for(int i = 0 ; i < M ; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            
            children.get(a).add(b);
            children.get(b).add(a);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);
        int[] arrow = new int[N];
        for(int i = 0 ; i < N ; i++){
            arrow[i] = -1;
        }
        arrow[0] = 0;
        while(!queue.isEmpty()){
            int now = queue.removeFirst();
            for(int next : children.get(now)){
                if(arrow[next] == -1){
                    queue.addLast(next);
                    arrow[next] = now+1;
                }
            }
        }
        
        StringBuilder strb = new StringBuilder("Yse\n");
        for(int i = 1 ; i < N ; i++){
            strb.append(arrow[i]);
            strb.append("\n");
        }
        System.out.println(strb.toString());
    }
}
