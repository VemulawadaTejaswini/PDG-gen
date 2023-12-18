import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int[][] map = new int[10][10];
        while(true) {
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            String[] A = line.split(",");
            int x = Integer.parseInt(A[0]);
            int y = Integer.parseInt(A[1]);
            int s = Integer.parseInt(A[2]);
            //小
            if(s == 1) {
                if(y-1 >= 0) {
                    map[y-1][x]++;
                }
                for(int i = x-1; i <= x+1; i++) {
                    if(i < 0) {
                        continue;
                    }
                    if(i > 9) {
                        break;
                    }
                    map[y][i]++;
                }
                if(y+1 <= 9) {
                    map[y+1][x]++;
                }
            }
            //中
            if(s == 2) {
                for(int j = y-1; j <= y+1; j++) {
                    if(j < 0) {
                        continue;
                    }
                    if(j > 9) {
                        break;
                    }
                    for(int i = x-1; i <= x+1; i++) {
                        if(i < 0) {
                            continue;
                        }
                        if(i > 9) {
                            break;
                        }
                        map[j][i]++;
                    }
                }
            }
            
            if(s == 3) {
                if(y-2 >= 0) {
                    map[y-2][x]++;
                }
                if(y+2 <= 9) {
                    map[y+2][x]++;
                }
                if(x-2 >= 0) {
                    map[y][x-2]++;
                }
                if(x+2 <= 9) {
                    map[y][x+2]++;
                }
                for(int j = y-1; j <= y+1; j++) {
                    if(j < 0) {
                        continue;
                    }
                    if(j > 9) {
                        break;
                    }
                    for(int i = x-1; i <= x+1; i++) {
                        if(i < 0) {
                            continue;
                        }
                        if(i > 9) {
                            break;
                        }
                        map[j][i]++;
                        
                    }
                }
            }
        }
        int max = 0;
        int count = 0;
        for(int i = 0; i <= 9; i++) {
            for(int j = 0; j <= 9; j++) {
                if(map[i][j] == 0) {
                    count++;
                }
                if(max < map[i][j]) {
                    max = map[i][j];
                }
            }   
        }
        System.out.println(count);
        System.out.println(max);
    }
}
