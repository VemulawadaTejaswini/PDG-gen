import java.awt.*;
import java.util.*;

class stat implements Comparable<stat>{
    int x;
    int y;
    int i;
    int j;

    public stat(int x, int y, int i, int j){
        this.x = x;
        this.y = y;
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(stat o){
        if(this.i - o.i == 0){
            return o.j - this.j;
        }
        return this.i - o.i;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        int x1 = sc.nextInt() - 1;
        int y1 = sc.nextInt() - 1;
        int x2 = sc.nextInt() - 1;
        int y2 = sc.nextInt() - 1;

        int[][] field = new int[h][w];

        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                if(s.charAt(j) == '@'){
                    field[i][j] = Integer.MAX_VALUE;
                }else{
                    field[i][j] = -1;
                }
            }
        }

        PriorityQueue<stat> q = new PriorityQueue<>();
        q.add(new stat(x1, y1, 0, 0));
        field[x1][y1] = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            stat p = q.poll();
            int current = field[p.x][p.y];

            next:
            for(int i = 0; i < 4; i++){
                for(int j = 1; j <= k; j++){
                    int x = dx[i] * j + p.x;
                    int y = dy[i] * j + p.y;

                    if(x < 0 || y < 0 || x >= h || y >= w || field[x][y] > -1){
                        continue next;
                    }

                    field[x][y] = current + 1;
                    q.add(new stat(x, y, current, j));
                }
            }

        }

        System.out.println(field[x2][y2]);

        //printArray(field, "%3d");


    }


    static void printArray(Object[] a, String format){
        StringBuilder sb = new StringBuilder();

        for(Object elements : a){
            Class<?> eClass = elements.getClass();

            if (eClass.isArray()) {
                if(eClass == int[].class){
                    for(int i : (int[])elements){
                        if(i == Integer.MAX_VALUE){
                            sb.append("###");
                        }else{
                            sb.append(String.format(format, i));
                        }
                    }
                    sb.append("\n");
                }else if(eClass == long[].class){
                    for(long i : (long[])elements){
                        sb.append(String.format(format, i));
                    }
                    sb.append("\n");
                }else if(eClass == boolean[].class){
                    for(boolean i : (boolean[])elements){
                        sb.append(i ? '#' : '.');
                    }
                    sb.append("\n");
                }else if(eClass == char[].class){
                    for(char i : (char[])elements){
                        sb.append(i);
                    }
                    sb.append("\n");
                }
            }else{
                sb.append(elements.toString());
            }
        }

        System.out.println(sb.toString());
    }
}
