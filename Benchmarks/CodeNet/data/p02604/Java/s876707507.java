import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][3];
    String[] check = new String[n*2];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<check.length; i++) check[i] = String.valueOf(i);

        StringBuilder sb = new StringBuilder();
        long first = 0;
        for (int i=0; i<n; i++) {
            int x = Math.abs(arr[i][0]);
            int y = Math.abs(arr[i][1]);
            first += Math.min(x, y) * arr[i][2];
        }
        sb.append(first + "\n");

//        System.out.print(sb.toString());

        for (int k=1; k<=1; k++) {
            long cost = (long)1e12;
            boolean[][] flag = new boolean[n][2];
            int[][] renewD = arr;
            Combinations<String> c = new Combinations<String>(check, k);
            Iterator<List<String>> i = c.iterator();
            while(i.hasNext()){
                List<String> t = i.next();
//                System.out.print(t);
                for (int v=0; v<t.size(); v++) {
                    int row = Integer.parseInt(t.get(v)) / 2;
                    int col = Integer.parseInt(t.get(v)) % 2;
                    flag[row][col] = true;
                }
                for (int v=0; v<n; v++) {
                    List<Integer> l = new ArrayList<>();
                    l.add(arr[v][0]);
                    List<Integer> r = new ArrayList<>();
                    r.add(arr[v][1]);
                    for (int u=0; u<n; u++) {
                        if (flag[u][0]) l.add(Math.abs(arr[v][0] - arr[u][0]));
                    }
                    Collections.sort(l);
                    renewD[v][0] = l.get(0);
                    for (int u=0; u<n; u++) {
                        if (flag[u][0]) r.add(Math.abs(arr[v][1] - arr[u][1]));
                    }
                    Collections.sort(r);
                    renewD[v][1] = r.get(0);
                }
                long tmpC = 0;
                for (int v=0; v<n; v++) {
                    long min = Math.min(Math.abs(renewD[v][0]), Math.abs(renewD[v][1]));
                    min *= (long)renewD[v][2];
                    tmpC += min;
                }
                cost = Math.min(cost, tmpC);
            }
            sb.append(cost + "\n");
        }

        System.out.print(sb.toString());

    }

    public class Combinations<T> implements Iterator{

        private List<List<T>> combinations;
        private List<T> list;
        private int[] index;
        private boolean[] visited;
        private int r;
        private Iterator<List<T>> iterator;

        public Combinations(T[] array, int r){
            this.list = Arrays.asList(array);
            this.index = new int[r];
            this.visited = new boolean[array.length];
            this.combinations = new ArrayList<List<T>>();
            this.r = r;
            this.compute(0);
            this.iterator = this.combinations.iterator();
        }

        private void compute(int n){
            if(n == r){
                List<T> combination = new ArrayList<T>();
                for(int i = 0;i < this.index.length;i++){
                    combination.add(list.get(index[i]));
                }
                combinations.add(combination);
            }
            else{
                for(int i = 0;i < this.list.size();i++){
                    if(n == 0 || !this.visited[i] && index[n - 1] < i){
                        this.visited[i] = true;
                        this.index[n] = i;
                        this.compute(n + 1);
                        this.visited[i] = false;
                    }
                }
            }
        }

        public List<List<T>> getCombinations(){
            return this.combinations;
        }

        public int count(){
            return this.combinations.size();
        }

        public List<T> next(){
            return this.iterator.next();
        }

        public boolean hasNext(){
            return this.iterator.hasNext();
        }

        public Iterator<List<T>> iterator(){
            return this.iterator;
        }

        public void remove(){
        }

    }

}

