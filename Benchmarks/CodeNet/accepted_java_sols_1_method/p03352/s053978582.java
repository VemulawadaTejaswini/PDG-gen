import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int upper = (int) Math.sqrt(X)+1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        int base = 2;
        while(base<=upper){
            int cur = base*base;
            while(cur<=X){
                pq.add(cur);
                cur = cur*base;
            }
            base++;
        }
        int ans = 0;
        while(pq.size()>1) ans = pq.poll();
        ans = pq.poll();

        System.out.println(ans);
    }
}