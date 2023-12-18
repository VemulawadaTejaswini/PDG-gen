import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int h = sc.nextInt();
                int w = sc.nextInt();
                while(h != 0){
                        sc.nextLine();
                        char[][] map = new char[h][w];
                        boolean[][] passed = new boolean[h][w];
                        int[] xy = new int[2];
                        passed[0][0] = true;
                        for(int i = 0 ; i < h ; i++){
                                String s = sc.nextLine();
                                for(int j = 0 ; j < w ; j++){
                                        map[i][j] = s.charAt(j);
                                }
                        }
                        System.out.println((move(map, xy, passed) == 1) ? xy[0] + " " + xy[1] : "LOOP");
                        h = sc.nextInt();
                        w = sc.nextInt();
                }
        }
        static int move(char[][] map, int[] xy, boolean[][] passed){
                switch(map[xy[1]][xy[0]]){
                        case '>':
                                xy[0]++;
                                break;
                        case '<':
                                xy[0]--;
                                break;
                        case '^':
                                xy[1]--;
                                break;
                        case 'v':
                                xy[1]++;
                                break;
                        case '.':
                                return 1;
                }
                if(passed[xy[1]][xy[0]]){
                        return -1;
                }else{
                        passed[xy[1]][xy[0]] = true;
                        return move(map, xy, passed);
                }
        }
}