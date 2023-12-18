//package beginner176;

import java.util.*;

public class Main {

    public static class Node{
        int r;
        int c;

        public Node(int pr, int pc){
            r = pr;
            c = pc;
        }
    }

    public static class Record{
        int index;
        int cnt;
        public Record(int i, int c){
            index = i;
            cnt = c;
        }
    }

    public static void main(String[] args){
        int H, W;

        Scanner in = new Scanner(System.in);

        H = in.nextInt();
        W = in.nextInt();
        int M = in.nextInt();
        int row[] = new int[H + 1];
        int col[] = new int[W + 1];
        int target[][] = new int[M][2];
        TreeMap<Node, Integer> treeMap = new TreeMap<Node, Integer>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.r != o2.r){
                    return o1.r - o2.r;
                }
                return o1.c - o2.c;
            }
        });
        Map<Integer, List<Integer>> edgeRow = new HashMap<>();

        for(int i = 0; i < M; i++){
            int r = in.nextInt();
            int c = in.nextInt();
            target[i][0] = r;
            target[i][1] = c;
            treeMap.put(new Node(r, c), 0);
            row[r]++;
            col[c]++;
            add(r, c, edgeRow);

        }

        Comparator<Record> cmp = new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o2.cnt - o1.cnt;
            }
        };

        List<Record> colList = new ArrayList<Record>();
        for(int i = 1; i <= W; i++){
            colList.add(new Record(i, col[i]));
        }
        colList.sort(cmp);

        int result = 0;

        for(int i = 1; i <= H; i++){
            int r = row[i];
            result = Math.max(result, r);
            if(edgeRow.containsKey(i)){
                List<Integer> list = edgeRow.get(i);

                for(int x : list){
                    result = Math.max(result, r - 1 + col[x]);
                }
            }
            for(int j = 0; j < colList.size(); j++){
                Record record = colList.get(j);
                if(treeMap.containsKey(new Node(i, record.index))){
                    continue;
                }
                result = Math.max(result, r + record.cnt);
                break;
            }
        }
        System.out.println(result);

    }

    public static void add(int i, int j, Map<Integer, List<Integer>> map){
        if(map.containsKey(i)){
            map.get(i).add(j);
        }else{
            List<Integer> list = new ArrayList<>();
            list.add(j);
            map.put(i, list);
        }
    }
}
