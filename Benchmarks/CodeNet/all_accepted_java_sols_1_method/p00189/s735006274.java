import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0)
                break;
            int[][] graph = new int[11][11];
            for(int[] temp:graph) Arrays.fill(temp, 1<<20);
            for(int i=0; i<11; i++) graph[i][i] =0;
            int num_v = 0;
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int d = sc.nextInt();
                num_v = Math.max(num_v, Math.max(x, y)+1);
                graph[x][y] = d;
                graph[y][x] = d;
            }
            for(int k=0; k<num_v; k++)
                for(int i=0; i<num_v; i++)
                    for(int j=0; j<num_v; j++)
                    {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k]+graph[k][j]);
//                        System.out.println(i+","+j+","+graph[i][j]);
                    }
            int min_dis = Integer.MAX_VALUE;
            int min_v = -1;
            for(int i=0; i<num_v; i++){
                int sum = 0;
                for(int j=0; j<num_v; j++) sum+=graph[i][j];
                if(sum < min_dis){
                    min_dis = sum;
                    min_v = i;
                }
            }
            System.out.println(min_v+" "+min_dis);
        }
    }
}
