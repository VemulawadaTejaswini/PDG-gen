import java.util.*;

class Main {
    //Kruskal's Algorithm
    private static final long MAX = (long) (2e10 + 1);
    private static int[] father;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int[][] edges = new int[E][3];
        father = new int[V];
        for(int i = 0; i < V; ++i){
            father[i] = i;
        }

        for(int i = 0; i < E; ++i){
            edges[i] = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        }

        Arrays.parallelSort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        long minCost = 0;
        int count = 0;
        for(int i = 0; i < E; ++i){
            int[] edge = edges[i];

            if(union(edge[0], edge[1])){
                minCost += edge[2];
                ++count;
                if(count == V - 1){
                    break;
                }
            }
        }

        System.out.println(minCost);
    }

    private static int compressFind(int x){
        int parent = father[x];
        while(parent != father[parent]){
            parent = father[parent];
        }

        int fa = x;
        int temp = -1;
        while(fa != father[fa]){
            temp = father[fa];
            father[fa] = parent;
            fa = temp;
        }

        return parent;
    }

    private static boolean union(int x, int y){
        int faX = compressFind(x);
        int faY = compressFind(y);

        if(faX == faY){
            return false;
        }

        father[faX] = faY;
        return true;
    }
}