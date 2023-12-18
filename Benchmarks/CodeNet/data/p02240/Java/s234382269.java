import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Main {
    public static void main(String args[]) throws Exception {

        // java.util.Scanner sc = new java.util.Scanner(new File("/Users/keisuke/dev/atcoder/ALDS_1_10_C/in.txt"));

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++)  list.add(new ArrayList<Integer>());

        for(int i=0; i<m; i++){
            int v1 = Integer.parseInt(sc.next());
            int v2 = Integer.parseInt(sc.next());
            list.get(v1).add(v2);
            list.get(v2).add(v1);
        }

        BFS bfs = new BFS(list);

        while(bfs.nextSeed()){
            bfs.execute();
        }
        
        int ansNum = Integer.parseInt(sc.next());
        for(int i=0; i<ansNum; i++){
            bfs.isSameRegion(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
    }


    static class BFS{
        private final List<List<Integer>> adjacency;
        private final Queue<Integer> queue;
        private final Stack<Integer> stack;
        private final int[] region;
        private int regionId = 0;
        private final int np;

        public int getNp(){
            return this.np;
        }

        public BFS(List<List<Integer>> adjacency){
            this.adjacency = adjacency;
            this.np = adjacency.size();
            this.region = new int[this.np];
            Arrays.fill(this.region, -1);
            this.queue = new ArrayDeque<>();
            this.stack = new Stack<>();
        }

        private void searchConnectedNode(int vi){
            this.region[vi] = this.regionId;
            for(int i=0; i<this.adjacency.get(vi).size(); i++){
                int next = this.adjacency.get(vi).get(i);
                if(this.region[next] == -1){
                    this.region[next] = this.regionId;
                    // this.queue.offer(next);
                    this.stack.push(next);
                }
            }
        }

        private boolean nextSeed(){
            for(int i=0; i<this.np; i++){
                if(this.region[i] == -1){
                    // this.queue.offer(i);
                    this.stack.push(i);
                    return true;
                }
            }
            return false;
        }
        public void execute(){
            while(!this.stack.isEmpty()){
                searchConnectedNode( this.stack.pop());
            }
            this.regionId++;
        }

        public void isSameRegion(int i, int j){
            System.out.println( this.region[i] == this.region[j] && this.region[i] != -1 ? "yes" : "no" );
        }
    }

    static enum Status{
        DONE,
        CURRENT,
        NOT_YET
    }
}

