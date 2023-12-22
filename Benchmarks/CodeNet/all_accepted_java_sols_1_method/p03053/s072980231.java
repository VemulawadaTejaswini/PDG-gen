import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();


        char chr[][] = new char[h][w];

        Queue<int []> queue = new ArrayDeque<int []>();
        for (int i=0; i<h; i++){
            String row = sc.next();
            for (int j=0; j<w; j++){
                chr[i][j] = row.charAt(j);
                if (chr[i][j]=='#'){
                    int start[] = {i, j, 0};
                    queue.add(start);
                }
            }
        }

        int flag[][] = new int[h][w];
        int count = 0;

        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};
        while(!queue.isEmpty()){
            int temp[] = queue.poll();
            int y = temp[0];
            int x = temp[1];
            int depth = temp[2];
            for (int i=0; i<4; i++){
                if (0<=y+dy[i] && y+dy[i]<= h-1 && 0<=x+dx[i] && x+dx[i]<=w-1){
                    if (flag[y+dy[i]][x+dx[i]]==0 && chr[y+dy[i]][x+dx[i]]=='.'){
                        flag[y+dy[i]][x+dx[i]]=1;
                        int add_queue[] = {y+dy[i], x+dx[i], depth+1};
                        queue.add(add_queue);
                        count = depth+1;
                    }
                }
            }
        }
        System.out.println(count);

    }

}

