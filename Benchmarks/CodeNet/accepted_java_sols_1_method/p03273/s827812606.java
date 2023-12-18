import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        ArrayList<Integer> delCols = new ArrayList<Integer>();
        ArrayList<Integer> delRows = new ArrayList<Integer>();
        for(int i = 0; i < h; i++){
            boolean bool = true;
            for(int j = 0; j < w; j++){
                if(map[i][j] == '#'){
                    bool = false;
                    break;
                }
            }
            if(bool) delRows.add(i);
        }
        for(int i = 0; i < w; i++){
            boolean bool = true;
            for(int j = 0; j < h; j++){
                if(map[j][i] == '#'){
                    bool = false;
                    break;
                }
            }
            if(bool){
                delCols.add(i);
            }
        }
        for(int i = 0; i < h; i++){
            if(delRows.contains(i)){
                continue;
            }
            for(int j = 0; j < w; j++){
                if(delCols.contains(j)){
                    continue;
                }
                System.out.print(map[i][j]); 
            }
            System.out.println();
        }
        
    }
}
