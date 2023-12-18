import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int ans = 0;
        PriorityQueue<Integer> wq = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>((x,y) -> y-x);
        for (int i = 0; i < n; i++) {
            if(c[i] == 'R') rq.add(i);
            else wq.add(i);
        }
        while(!rq.isEmpty() && !wq.isEmpty() && rq.peek() > wq.peek()){
            ans++;
            wq.add(rq.poll());
            rq.add(wq.poll());
        }
        System.out.println(ans);
        sc.close();

    }

}
