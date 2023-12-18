import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        Integer[] rc = new Integer[a];
        Integer[] gc = new Integer[b];
        Integer[] nc = new Integer[c];
        PriorityQueue<Integer> rq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> gq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> nq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<a; i++){
            rc[i] = Integer.parseInt(sc.next());
            rq.add(rc[i]);
        }
        for(int i=0; i<b; i++){
            gc[i] = Integer.parseInt(sc.next());
            gq.add(gc[i]);
        }
        for(int i=0; i<c; i++){
            nc[i] = Integer.parseInt(sc.next());
            nq.add(nc[i]);
        }
        nq.add(-1);
        Arrays.sort(rc, Collections.reverseOrder());
        Arrays.sort(gc, Collections.reverseOrder());
        PriorityQueue<Integer> red = new PriorityQueue<>();
        PriorityQueue<Integer> green = new PriorityQueue<>();
        
        long ans = 0;
        for(int i=0; i<x; i++){
            red.add(rc[i]);
            ans += rc[i];
        }
        for(int i=0; i<y; i++){
            green.add(gc[i]);
            ans += gc[i];
        }
        
        while(nq.size()!=0){
            int tmp = nq.poll();
            int s = red.peek();
            int t = green.peek();
            if(s < t){
                if(s < tmp){
                    ans -= red.poll();
                    ans += tmp;
                    red.add(tmp);
                }
            }else{
                if(t < tmp){
                    ans -= green.poll();
                    ans += tmp;
                    green.add(tmp);
                }
            }
        }
        
        System.out.println(ans);
        
    }
}
