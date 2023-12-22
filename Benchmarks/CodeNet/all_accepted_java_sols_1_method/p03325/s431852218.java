import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if(t%2==0) pq.add(t);
        }
        int c= 0;
        while(pq.size()>0){
            int r = pq.poll();
            c++;
            r/=2;
            if(r%2==0) pq.add(r);
        }
        System.out.println(c);
    }
}
