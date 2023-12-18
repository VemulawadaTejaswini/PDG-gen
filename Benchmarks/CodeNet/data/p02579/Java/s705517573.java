//package beginner176;

import java.util.*;

public class Main {


    public static class Node{
        int x;
        int y;
        public Node(int px, int py){
            x = px;
            y = py;
        }
    }

    public static class Record{
        int color;
        int len;

        public Record(int c, int l){
            color = c;
            len = l;
        }
    }

    public static void main(String[] args){


        Scanner in = new Scanner(System.in);

        int H, W;
        H = in.nextInt();
        W = in.nextInt();
        int ch, cw;
        ch = in.nextInt();
        cw = in.nextInt();
        ch--;
        cw--;

        int dh, dw;
        dh = in.nextInt();
        dw = in.nextInt();
        dh--;
        dw--;

        String[] maze = new String[H];

        for(int i = 0; i < H; i++){
            maze[i] = in.next();
        }

        int colorCnt = 0;
        int [][] colorMaze = new int[H][W];


        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(maze[i].charAt(j) == '#'){
                    continue;
                }
                if(colorMaze[i][j] == 0 && maze[i].charAt(j) == '.'){
                    colorCnt++;
                    colorMaze[i][j] = colorCnt;
                    Deque<Node> deque = new LinkedList<Node>();
                    deque.add(new Node(i, j));
                    while(!deque.isEmpty()){
                        Node node = deque.poll();
                        if(node.x > 0 && maze[node.x - 1].charAt(node.y) == '.' && colorMaze[node.x - 1][node.y] == 0){
                            colorMaze[node.x - 1][node.y] = colorCnt;
                            deque.add(new Node(node.x - 1, node.y));
                        }
                        if(node.x < H - 1 && maze[node.x + 1].charAt(node.y) == '.' && colorMaze[node.x + 1][node.y] == 0){
                            colorMaze[node.x + 1][node.y] = colorCnt;
                            deque.add(new Node(node.x + 1, node.y));
                        }
                        if(node.y > 0 && maze[node.x].charAt(node.y - 1) == '.' && colorMaze[node.x][node.y - 1] == 0){
                            colorMaze[node.x][node.y - 1] = colorCnt;
                            deque.add(new Node(node.x, node.y - 1));
                        }
                        if(node.y < W - 1 && maze[node.x].charAt(node.y + 1) == '.' && colorMaze[node.x][node.y + 1] == 0){
                            colorMaze[node.x][node.y + 1] = colorCnt;
                            deque.add(new Node(node.x, node.y + 1));
                        }
                    }
                }
            }
        }
//        boolean connect[][] = new boolean[colorCnt + 1][colorCnt + 1];
        Map<Integer, List<Integer>> edges = new HashMap<Integer, List<Integer>>();

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(maze[i].charAt(j) == '#'){
                    continue;
                }
                int c = colorMaze[i][j];
                for(int h = i; h <= Math.min(i + 2, H - 1); h++){
                    for(int w = Math.max(0, j - 2); w <= Math.min(j + 2, W - 1); w++){
                        if(maze[h].charAt(w) == '#'){
                            continue;
                        }
                        if(colorMaze[h][w] == c){
                            continue;
                        }
                        int c1 = colorMaze[h][w];
                        
                        add(c, c1, edges);
                        add(c1, c, edges);

                    }
                }
            }
        }

        Deque<Record> deque = new LinkedList<Record>();
        deque.add(new Record(colorMaze[ch][cw], 0));
        boolean visit[] = new boolean[colorCnt + 1];
        visit[colorMaze[ch][cw]] = true;

        while(!deque.isEmpty()){
            Record record = deque.poll();
            if(colorMaze[dh][dw] == record.color){
                System.out.println(record.len);
                return;
            }
            if(edges.containsKey(record.color)){
                List<Integer> list = edges.get(record.color);
                for(int x : list){
                    if(visit[x]){
                        continue;
                    }
                    visit[x] = true;
                    deque.add(new Record(x, record.len + 1));
                }
            }
        }
        System.out.println(-1);
    }

    public static void add(int i, int j, Map<Integer, List<Integer>> map){
        if(map.containsKey(i)){
            map.get(i).add(j);
        }else{
            List<Integer> list = new ArrayList<Integer>();
            list.add(j);
            map.put(i, list);
        }
    }
}
