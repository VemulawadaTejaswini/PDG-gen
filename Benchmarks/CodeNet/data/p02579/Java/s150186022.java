
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/11 11:30 下午
 */
public class Main {

    static class Node{
        int i;
        int j;
        int value;

        Node(int i,int j,int value){
            this.i = i;
            this.j =j;
            this.value =value;
        }
    }

    private static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

    private static int vis[][] = new int[1003][1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int s = scanner.nextInt();
        int e= scanner.nextInt();
        int ts = scanner.nextInt();
        int te = scanner.nextInt();
        String[] map = new String[h+1];
        for(int i=1;i<=h;i++){
            map[i] =scanner.next();
        }
        for(int i = 1;i<=h;i++){
            for(int j = 1;j<=w;j++){
                vis[i][j] = 100000000;
            }
        }
        Deque<Node> deque = new LinkedList<>();
        deque.add(new Node(s,e,0));
        vis[s][e] = 0;
        while(!deque.isEmpty()){
            Node node = deque.pollFirst();
            int now_i = node.i;
            int now_j = node.j;
            int now_value = node.value;
            for(int i = 0;i<4;i++){
                int tmp_i = dir[i][0] + now_i;
                int tmp_j = dir[i][1] + now_j;
                if(tmp_i <=0 || tmp_i > h || tmp_j <=0 || tmp_j > w)continue;
                if(vis[tmp_i][tmp_j] > now_value  && map[tmp_i].charAt(tmp_j-1) != '#') {
                    deque.addFirst(new Node(tmp_i, tmp_j, now_value));
                    vis[tmp_i][tmp_j] = now_value;
                }
            }
            for(int i = now_i-2;i<=now_i+2;i++){
                if(i <=0 || i > h)continue;
                for(int j = now_j-2;j<=now_j+2;j++){
                    if(j <=0 || j > w)continue;
                    if(vis[i][j] > now_value+1 && map[i].charAt(j-1) != '#') {
                        deque.addLast(new Node(i, j, now_value+1));
                        vis[i][j] = now_value+1;
                    }
                }
            }
        }
        System.out.println(vis[ts][te] == 100000000?-1:vis[ts][te]);
    }
}
