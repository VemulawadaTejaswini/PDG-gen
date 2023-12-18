import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                boolean[][] map = new boolean[9][];
                for(int i = 0; i < 9; i++){
                        String s = sc.nextLine();
                        boolean[] b = new boolean[s.length()];
                        for(int j = 0; j < s.length(); j++){
                                b[j] = s.charAt(j) == '1';
                        }   
                        map[i] = b;
                }   
                sc.close();
                int[] x = new int[2];
                boolean[][][] p = new boolean[5][5][4];
                for(int i = 0; i < 5; i++){
                        for(int j = 0; j < 5; j++){
                                boolean[] b = p[i][j];
                                b[0] = j < 4 ? map[2*i][j] : false;
                                b[1] = i < 4 ? map[2*i+1][j] : false;
                                b[2] = j > 0 ? map[2*i][j-1] : false;
                                b[3] = i > 0 ? map[2*i-1][j] : false;
                        }   
                }   
                do{ 
                        add(x, Direction.next(p[x[0]][x[1]]));
                }while(!Arrays.equals(x, new int[2]));
                System.out.println();
        }   
        static void add(int[] a, int[] b){
                a[0] += b[0];
                a[1] += b[1];
        }   
        static class Direction{
                static int c = 0;
                static int[][] v = {{0,1},{1,0},{0,-1},{-1,0}};
                static String[] s = {"R","D","L","U"};
                static int[] next(boolean[] wall){
                        int tmp = next(next(next(c)));
                        while(!wall[tmp]){
                                tmp = next(tmp);
                        }   
                        c = tmp;
                        System.out.print(s[c]);
                        return v[c];
                }   
                static private int next(int d){
                        if(++d == 4) d = 0;
                        return d;
                }   
        }   
}