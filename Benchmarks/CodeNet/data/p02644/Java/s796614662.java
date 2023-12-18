import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st  = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken())-1;
        int y1 = Integer.parseInt(st.nextToken())-1;
        int x2 = Integer.parseInt(st.nextToken())-1;
        int y2 = Integer.parseInt(st.nextToken())-1;

        char[][] board = new char[r][c];
        for (int i=0; i<r; i++) {
            String s = (br.readLine());
            for (int j=0; j<c; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        PriorityQueue<myEl> pq = new PriorityQueue<>(new Comparator<myEl>(){
            @Override
            public int compare(myEl e1, myEl e2){
                return e1.steps-e2.steps;
            }
        });

        HashSet<String> vis = new HashSet();
        pq.offer(new myEl(x1,y1,0));
        vis.add(x1+","+y1);

        int ans = -1;
        while(!pq.isEmpty()){
            myEl cur = pq.poll();
            if (cur.x==x2 && cur.y==y2) {
                ans = cur.steps;
                break;
            }
            //N
            int curX=cur.x-1,curY=cur.y,k=K;
            while(curX>=0 && board[curX][curY]!='@' &&k>0){
                if (vis.contains(curX+","+curY)) {
                    curX--;k--;

                    continue;
                }
                vis.add(curX+","+curY);
                pq.offer(new myEl(curX,curY,cur.steps+1));
                curX--;k--;
            }
            //S
            curX=cur.x+1;curY=cur.y;k=K;
            while(curX<r && board[curX][curY]!='@' &&k>0){
                if (vis.contains(curX+","+curY)) {
                    curX++;k--;

                    continue;
                }
                vis.add(curX+","+curY);

                pq.offer(new myEl(curX,curY,cur.steps+1));
                curX++;k--;
            }
            //W
            curX=cur.x;curY=cur.y-1;k=K;
            while(curY>=0 && board[curX][curY]!='@' && k>0){
                if (vis.contains(curX+","+curY)) {
                    curY--;k--;

                    continue;

                }
                vis.add(curX+","+curY);
                pq.offer(new myEl(curX,curY,cur.steps+1));
                curY--;k--;
            }
            //E
            curX=cur.x;curY=cur.y+1;k=K;
            while(curY<c && board[curX][curY]!='@' &&k>0){
                if (vis.contains(curX+","+curY)) {
                    curY++;k--;

                    continue;
                }
                vis.add(curX+","+curY);

                pq.offer(new myEl(curX,curY,cur.steps+1));
                curY++;k--;
            }

        }
        System.out.println(ans);

    }

    static class myEl{
        int steps,x,y;
        myEl(int a,int b,int c){
            x=a;
            y=b;
            steps=c;
        }
    }
}