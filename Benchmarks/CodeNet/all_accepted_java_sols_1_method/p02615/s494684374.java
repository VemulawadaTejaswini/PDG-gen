import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 0; i < n; i++){
            q.add(sc.nextInt());
        }
        long ans = 0;

        LinkedList<Integer> pos = new LinkedList<>();

        pos.add(q.poll());

        while(!q.isEmpty()){
            ans += pos.poll();
            int a = q.poll();
            pos.add(a);
            pos.add(a);
        }

        System.out.println(ans);

    }
}
