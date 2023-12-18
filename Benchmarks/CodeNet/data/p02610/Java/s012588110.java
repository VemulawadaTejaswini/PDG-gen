import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            solve(sc);
        }
    }

    public static void solve(Scanner sc){
        int N = sc.nextInt();
        List<Place> v = new ArrayList<>();
        long base=0;
        for(int i=0;i<N;i++){
            int k,l,r;
            k = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            base += (long)Math.min(l,r);
            v.add(new Place(k,l,r,N));
        }
        v.sort(new Comparator<Place>() {
            @Override
            public int compare(Place o1, Place o2) {
                return o2.gain - o1.gain;
            }
        });
        Map<Integer, PriorityQueue<Place>> lmp = new HashMap<>();
        Map<Integer, PriorityQueue<Place>> rmp = new HashMap<>();
        List<Place> ll=new ArrayList<>();
        List<Place> rl=new ArrayList<>();
        for(int i=0;i<N;i++){
            Place t = v.get(i);
            if(t.isLeft()){
                lmp.putIfAbsent(t.K, new PriorityQueue<>(Comparator.comparingInt(p->-p.K)));
                lmp.get(t.K).add(t);
            }else{
                rmp.putIfAbsent(t.K, new PriorityQueue<>(Comparator.comparingInt(p->-p.K)));
                rmp.get(t.K).add(t);
            }
        }
        for(int i=1;i<=N;i++) {
            if (lmp.containsKey(i)) {
                PriorityQueue<Place> pq = lmp.get(i);
                while (ll.size() <= i && !pq.isEmpty()) {
                    base += pq.peek().gain;
                    ll.add(pq.poll());
                }
            }
            if (rmp.containsKey(i)) {
                PriorityQueue<Place> pq = rmp.get(i);
                while (rl.size() <= i && !pq.isEmpty()) {
                    base += pq.peek().gain;
                    rl.add(pq.poll());
                }
            }
        }
        System.out.println(base);
    }

    public static class Place{
        int gain;
        int lr;
        int K;
        public Place(int k, int l, int r, int N){
            if(l-r > 0){
                gain = l-r;
                lr=-1;//left of K
                K=k;
            }else{
                gain = r-l;
                lr=1;//right of K
                K=N-k;
            }
        }
        public String toString(){
            return gain + " - " + K + ":" + lr;
        }
        public boolean isLeft(){
            return lr == -1;
        }
    }
}
