import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        boolean[][] map;
        int[][] point=new int[num][4];
        int x_max=0;
        int x_min=2001;
        int y_max=0;
        int y_min=2001;
        for(int n=0;n<num;n++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<point[0].length;i++){
                point[n][i]=Integer.parseInt(st.nextToken());
                x_max=Math.max(x_max,point[n][2]);
                x_min=Math.min(x_min,point[n][0]);
                y_max=Math.max(y_max,point[n][3]);
                y_min=Math.min(y_min,point[n][1]);
            }
        }
        map=new boolean[y_max-y_min+1][x_max-y_min+1];
        int count=0;
        for(int i=0;i<point.length;i++){
            for(int j=0;j<(point[i][3]-point[i][1]);j++){
                for(int k=0;k<(point[i][2]-point[i][0]);k++){
                    map[point[i][1]+j][point[i][0]+k]=true;
                }
            }
        }for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]) count++;
            }
        }System.out.println(count);
    }
}