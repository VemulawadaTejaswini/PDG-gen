


import java.util.*;
import java.io.*;
 
public class Main{
//    static IO io = new IO();
    
    static String map[][];
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};
    static int ys;
    static int xs;
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        while (true) {
             
            ys = sc.nextInt();
            xs = sc.nextInt();
            sc.nextLine();
            if (ys==0 && xs==0) break;
            map = new String[ys][xs];
            for (int i = 0; i < xs; i++) {
    			String temp = sc.nextLine();
    			for (int j = 0; j < temp.length(); j++) {
    				char c = temp.charAt(j);
    				map[i][j] = String.valueOf(c);
    			}
    		}
             
            int ans = 0;
             
            for (int j=0; j<ys; j++) {
                for (int i=0; i<xs; i++) {
                    if ("@".equals(map[j][i]) || "#".equals(map[j][i]) || "*".equals(map[j][i])) {
                        dfs(i, j, map[j][i]);
                        ans++;
                    }
                }
            }
             
            System.out.println(ans);
 
        }
         
    }
     
    static void dfs(int x, int y, String c) {
         
        map[y][x] = " ";
        for (int i=0; i<4; i++) {
            if (0<=x+dx[i] && x+dx[i]<xs && 0<=y+dy[i] && y+dy[i]<ys) {
                if (c.equals(map[y+dy[i]][x+dx[i]])) dfs(x+dx[i], y+dy[i], c);
            }
        }
         
    }
}
