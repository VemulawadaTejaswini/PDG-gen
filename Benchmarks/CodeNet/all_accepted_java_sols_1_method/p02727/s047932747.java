import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        PriorityQueue<Integer> qa = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> qb = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < a; i++){
            qa.add(sc.nextInt());
        }
        for(int i = 0; i < b; i++){
            qb.add(sc.nextInt());
        }
        for(int i = 0; i < c; i++){
            q.add(sc.nextInt());
        }
        for(int i = 0; i < x; i++){
            q.add(qa.poll());
        }
        for(int i = 0; i < y; i++){
            q.add(qb.poll());
        }

        long ans = 0;

        for(int i = 0; i < x + y; i++){
            ans += q.poll();
        }

        System.out.println(ans);
    }
}
