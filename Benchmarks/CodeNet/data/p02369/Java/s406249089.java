import java.util.Scanner;

import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    
    static class Graph {
        int V;
        //public interface IntegerNodeList extends List<IntegerNode> {} // this is to fixed up the array of lists bug....
        LinkedList<Integer>[] adjList;
        @SuppressWarnings({"unchecked"})
        public Graph(int V) {
            this.V = V;

            //adjList = (LinkedList<Integer>[]) new LinkedList<?>[V];
            adjList = new LinkedList[V];
            for (int i = 0; i < V ; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
        
        public void addEdge(int src, int dest) {
            //增加一條edge, 由參數一指向參數二
            //若 A指向B , 那就應該要在A 的Adjgency list 掛上B 代表可以從A 走到B 
            // 換句話說，代表 AdjList[A] 內容物是一個Linklist, 紀錄哪些可以被到達的點
            adjList[src].addFirst(dest);
            // addFirst 應該是繼承自LinkedList 的method?
        }
        public boolean White_Init() {
            HashSet<Integer> White = new HashSet<>();
            HashSet<Integer> Gray = new HashSet<>();
            HashSet<Integer> Black = new HashSet<>();
            
            //把所有V都丟進去白色區域
            for(int i = 0 ; i< V ; i++) {
                White.add(i); // 這是HashSet的內建method
            }
            for(int i = 0 ; i < V ; i++) {
                if(White.contains(i)&& Recursive_DFS(i,White,Gray,Black)){
                    return true;
                }
//                if(White.contains(1)){ // 待測試 不確定跟上面差異
//                    boolean result = Recursive_DFS(i, White,Gray,Black);
//                    if(result){
//                        return true;
//                    }
//                }

            }
            //每個點都輪流當起點檢查一輪後都還沒有找到 那就是沒有了
            return false;
            
        }
        public boolean Recursive_DFS(int vertex, HashSet<Integer> White, HashSet<Integer> Gray, HashSet<Integer> Black){
            //踩進 vertex, 也就是 i 把他從白色除名，他被踩了
            White.remove(vertex);
            Gray.add(vertex);
            
            //檢查所有目的地
            for(int i = 0; i < adjList[vertex].size() ; i++){
                int Picked_vertex = adjList[vertex].get(i);  // 拿出vertex的第i個目的地 (也是數字 但是可能是任何它本身以外或他本身(自我迴圈)
                if (Gray.contains(Picked_vertex)){
                    return true;
                }
                if (Black.contains(Picked_vertex)){
                    continue; // 黑色群集的意思是 以黑色的該點以下都被整理玩了 
                    //例如 如果從總統開始往下查貪汙 然後行政院長還有考試院長底下都分別有其他組織，也都該被查
                    //若是有個組織會連結到行政院長，且行政院長以下所有處室都證明清白了，
                    //那就不用進去檢查行政院了
                }
                //到這代表這個目的地是白的 雖然我還是可以寫的冗長一點
                if (White.contains(Picked_vertex)){
                    boolean result = Recursive_DFS(Picked_vertex,White,Gray,Black);
                    if (result){
                        return true;
                    }
                }
                
            }
            // if it runs here, that's means there's no more目的地 anymore. 
            // 所以這個點不再是灰色了 應該要丟到黑色了。
            Gray.remove(vertex);
            Black.add(vertex);
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        Graph graph = new Graph(V);
        for(int i = 0 ; i < E ; i++){
            graph.addEdge(scanner.nextInt(), scanner.nextInt());
        }
        boolean result = graph.White_Init();
        if(result){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        
        
        
    }
}


