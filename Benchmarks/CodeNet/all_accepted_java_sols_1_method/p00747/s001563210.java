import java.util.*;
import java.util.Queue;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w==0 && h==0) break;
            int s_wall[][] = new int[h][w-1];
            int v_wall[][] = new int[h-1][w];
            for(int i = 0; i<h; i++){
                for(int j = 0; j<w-1; j++){
                    s_wall[i][j] = sc.nextInt();
                }
                for(int j = 0; j<w; j++){
                    if(i!=h-1) v_wall[i][j] = sc.nextInt();
                }
            }
            Queue <ArrayList<Integer>> q = new ArrayDeque <ArrayList<Integer>> ();
            int dist[][] = new int[h][w];
            //-1
            for(int i = 0; i<h; i++){
                for(int j = 0; j<w; j++){
                    dist[i][j] = -1;
                }
            }
            //DFS
            Boolean ok = false;
            dist[0][0] = 0;
            q.add(new ArrayList<Integer>(Arrays.asList(0,0)));
            while(!(q.isEmpty())){
                ArrayList<Integer> v = q.poll();
                int v1 = v.get(0);
                int v2 = v.get(1);
                if(v1 == h-1 && v2 == w-1){
                    ok = true;
                    break;
                }
                int d = dist[v1][v2];
                if(v2 < w-1){
                    if(s_wall[v1][v2] == 0){
                        if(dist[v1][v2+1] == -1){
                            q.add(new ArrayList<Integer>(Arrays.asList(v1,v2+1)));
                            dist[v1][v2+1] = d+1;
                        }
                    }
                }
                if(v2>0){
                    if(s_wall[v1][v2-1]==0){
                        if(dist[v1][v2-1] == -1){
                            q.add(new ArrayList<Integer>(Arrays.asList(v1,v2-1)));
                            dist[v1][v2-1] = d+1;
                        }
                    }
                }
                if(v1>0){
                    if(v_wall[v1-1][v2] == 0){
                        if(dist[v1-1][v2] == -1){
                            q.add(new ArrayList<Integer>(Arrays.asList(v1-1,v2)));
                            dist[v1-1][v2] = d+1;
                        }
                    }
                }
                if(v1 < h-1){
                    if(v_wall[v1][v2]==0){
                        if(dist[v1+1][v2]==-1){
                            q.add(new ArrayList<Integer>(Arrays.asList(v1+1,v2)));
                            dist[v1+1][v2] = d+1;
                        }
                    }
                }
            }
            if(ok)System.out.println(dist[h-1][w-1]+1);
            else System.out.println(0);
        }
        sc.close();
    }
}
