import java.util.*;

class Main{
        public static void main(String[] args){
                int[][][] p = new int[7][4][4];
                p[0][0] = new int[]{1,1,0,0};
                p[0][1] = new int[]{1,1,0,0};
                for(int i = 0; i < 4; i++){
                        p[1][i][0] = 1;
                        p[2][0][i] = 1;
                }
                p[3][0][0] = 1;
                p[3][1][0] = 1;
                p[4][0] = new int[]{1,1,0,0};
                p[4][1] = new int[]{0,1,1,0};
                p[5][0][0] = 1;
                p[5][1] = new int[]{1,1,0,0};
                p[5][2][1] = 1;
                p[6][0] = new int[]{1,1,0,0};
                p[6][1][0] = 1;
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int[][] map = new int[11][11];
                        for(int i = 0; i < 8; i++){
                                String s = sc.nextLine();
                                if(s.equals("")){
                                        s = sc.nextLine();
                                }
                                for(int j = 0; j < 8; j++){
                                        map[i][j] = s.charAt(j)-'0';
                                }
                        }
                        int[][] _p = new int[4][4];
                        search:for(int i = 0; i < 8; i++){
                                for(int j = 0; j < 8; j++){
                                        if(map[i][j] == 1){
                                                for(int k = 0; k < 4; k++){
                                                        for(int l = 0; l < 4; l++){
                                                                _p[k][l] = map[i+k][j+l];
                                                        }
                                                }
                                                break search;
                                        }
                                }
                        }
                        int n = 0;
                        while(!Arrays.deepEquals(p[n], _p)){
                                n++;
                        }
                        System.out.println((char)('A'+n));
                }
                sc.close();
        }
}