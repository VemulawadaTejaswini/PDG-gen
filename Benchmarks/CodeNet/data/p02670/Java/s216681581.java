import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[][] seat = new boolean[n][n];

        int count = 0;

        for(int i=0; i<n*n; i++){

            int p = sc.nextInt();

            seat[(p-1)/n][(p-1)%n] = true;
            //System.out.println((p-1)/n + " " + (p-1)%n);

            Deque<Map<String,Integer>> que = new ArrayDeque();
            Map<String,Integer> map = new HashMap<>();
            map.put("x", (p-1)%n);
            map.put("y", (p-1)/n);
            que.add(map);

            int min = n*n + 1;
            boolean[][] ary = new boolean[n][n];
            while(!que.isEmpty()){

                map = que.removeFirst();
                int x = map.get("x");
                int y = map.get("y");

                if(x == 0 || y == 0 || x == n-1 || y == n-1){
                    min = 0;
                    break;
                }
                else{
                    int xtemp = x < n-x-1 ? x : n-x-1;
                    int ytemp = y < n-y-1 ? y : n-y-1;
                    int temp = xtemp < ytemp ? xtemp : ytemp;
                    min = min<temp ? min : temp;
                }
                if(x-1 > 0 && seat[y][x-1] && !ary[y][x-1]){
                    ary[y][x-1] = true;
                    map = new HashMap<>();
                    map.put("x", x-1);
                    map.put("y", y);
                    que.add(map);
                }
                if(y-1 > 0 && seat[y-1][x] && !ary[y-1][x]){
                    ary[y-1][x] = true;
                    map = new HashMap<>();
                    map.put("x", x);
                    map.put("y", y-1);
                    que.add(map);
                }
                if(x+1 < n && seat[y][x+1] && !ary[y][x+1]){
                    ary[y][x+1]=true;
                    map = new HashMap<>();
                    map.put("x", x+1);
                    map.put("y", y);
                    que.add(map);
                }
                if(y+1 < n && seat[y+1][x] && ary[y+1][x]){
                    ary[y+1][x]= true;
                    map = new HashMap<>();
                    map.put("x", x);
                    map.put("y", y+1);
                    que.add(map);
                }
            }
            count += min;
        }

        System.out.println(count);
    }
}