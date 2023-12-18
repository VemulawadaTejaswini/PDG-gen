import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y, w, h, start = 0, point = 0, goal, count, k=0;    
        while(true){
            goal = 0;
            count = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            int[] movex = {0, 1, 0, 0}, movey = {0, 0, 0, 1}, movexx = {-1, 1, 0, 0}, moveyy = {0, 0, -1, 1};
            if(w==0 && h==0) break;
            int[][] tate = new int[h+1][w+1];
            int[][] yoko = new int[h+1][w+1];
            int[][] data = new int[h+1][w+1];
            for(int i=0;i<w;i++){
                yoko[0][i] = 1;
                yoko[h][i] = 1;
            }
            for(int i=0;i<h*2-1;i++){
                for(int j=0;j<=w;j++){
                    if(i%2==0){
                        if(j==0 || j==w){
                            tate[i/2][j] = 1;
                        }else{
                            tate[i/2][j] = sc.nextInt();
                        }
                    }else{
                        if(j==w) break;
                        yoko[i/2+1][j] = sc.nextInt();
                    }
                }
            }
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(start);
            while(!queue.isEmpty()){
                point = queue.remove();
                k = point/10000;
                point -= k*10000;
                x = point/100;
                y = point%100;
                if(x==w-1 && y==h-1){
                    count = k + 1;
                    goal++;
                    break;
                }
                data[y][x] = 1;
                for(int i=0;i<4;i++){
                    if((tate[y][x+movex[i]]==0 && data[y][x+movexx[i]]==0) || (yoko[y+movey[i]][x]==0 && data[y+moveyy[i]][x]==0)){
                        int c = k+1;
                        int p = x+movexx[i];
                        int q = y+moveyy[i];
                        int r = c*10000+p*100+q;
                        data[q][p] = 1;
                        queue.add(r);
                    }
                }
            }
            if(goal==1){
                System.out.println(count);
            }else{
                System.out.printf("0\n");
            }
            while(!queue.isEmpty()){
                int bag = queue.remove();
            }
        }
    }
}
