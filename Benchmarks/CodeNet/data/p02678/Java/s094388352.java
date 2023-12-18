import java.util.*;

public class Main {
    static int max = 1000000;
    static int[] queue = new int[max];
    static int tail = 0; static int head = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        init();
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,TreeSet<Integer>> graph = new HashMap<>();
        for (int i=1;i<=n;i++)graph.put(i,new TreeSet<Integer>());
        for (int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        //int[] depth = new int[n+1];
        //depth[1] = 0;
        boolean[] seen = new boolean[n+1];
        for (int i=0;i<=n;i++)seen[i]=false;
        enqueue(1);
        //int count = 1;
        int[] flag = new int[n+1];
        while (!isEmpty()){
            int v = dequeue();
            for (int a : graph.get(v)){
                if (!seen[a]){
                    seen[a]=true;
                    //depth[a]=count;
                    flag[a]=v;
                    enqueue(a);
                }
            }
            //count++;
        }
        System.out.println("Yes");
        for (int i=2;i<=n;i++)System.out.println(flag[i]);
    }

    static void init(){head = 0; tail = 0;}
    static boolean isEmpty(){return (head==tail);}
    static boolean isFull(){return (head == (tail+1)%max);}
    static public void enqueue(int v){
        if (isFull()){
            System.out.println("error: queue is full.");
            return;
        }
        queue[tail++] = v;
        if (tail == max) tail = 0;
    }
    static public int dequeue(){
        if (isEmpty()){
            System.out.println("error: queue is empty");
            return -1;
        }
        int res = queue[head];
        ++head;
        if (head == max) head = 0;
        return res;
    }
}
