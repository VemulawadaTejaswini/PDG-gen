import java.util.*;

class Main{

    LinkedList<int[]> list;
    PriorityQueue<int[]> empty;

    void solve(){
        Scanner sc = new Scanner(System.in);
        int INF = Integer.MAX_VALUE;

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            list = new LinkedList<int[]>(); // from, to, id
            empty = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[0] - b[0];
                    }
                });
            empty.add(new int[]{0, INF});

            for(int i=0; i<n; i++){
                char command = sc.next().charAt(0);
                if(command=='R') print(sc.nextInt());
                if(command=='W') write(sc.nextInt(), sc.nextInt());
                if(command=='D') delete(sc.nextInt());
            }
            System.out.println();
        }
    }

    void print(int idx){
        for(int i=0; i<list.size(); i++){
            int[] one = list.poll();
            if(one[0]<=idx && idx<=one[1]){
                System.out.println(one[2]);
                list.add(one);
                return;
            }
            list.add(one);
        }
        System.out.println(-1);
    }

    void write(int idx, int length){
        while(length>0){
            int[] one = empty.poll();
            int from = one[0], to = Math.min(one[0]+length-1, one[1]);
            list.add(new int[]{from, to, idx});
            length -= Math.min(length, to-from+1);
            if(to<one[1]) empty.add(new int[]{to+1, one[1]});
        }
    }

    void delete(int idx){
        int size = list.size();
        for(int i=0; i<size; i++){
            int[] one = list.poll();
            if(one[2]==idx) empty.add(new int[]{one[0], one[1]});
            else list.add(one);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}