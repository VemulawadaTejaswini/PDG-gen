import java.util.*;
 
public class Main{
    static int[][] islandMap = new int[12][12];//島の地図を数字のまま取込
    static boolean[][] checkMap = new boolean[12][12];//チェック用地図
    static int count;//島を数える

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
             
        while(scanner.hasNext()){
            for(int i=0; i<12; i++){
                String line = scanner.next();
                for(int j=0; j<12; j++){
                    islandMap[i][j] = Integer.parseInt(line.substring(j, j+1));
                    //チェック用地図には島をfalse、海はtrue。
                    //探索後の島はtrueに変えて海に沈める。
                    if(islandMap[i][j] == 1){
                        checkMap[i][j] = false;
                    }else if(islandMap[i][j] == 0){
                        checkMap[i][j] = true;
                    }
//使っていない：    Deque<String> deque = new ArrayDeque<>();
//検証用
//System.out.print(islandMap[i][j]);
//System.out.print(checkMap[i][j] + " ");                    
                }
//System.out.println("");
            }
            for(int k = 0;k <12;k++){
                for(int l = 0; l<12; l++){
                    if(islandMap[k][l]==1 && !checkMap[k][l]) {
                        checkIsland(k,l);
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
    static void checkIsland(int x, int y) {
        finished(x,y);
        count++;
//検証用
//System.out.print("カウントしました");             
    }
 
    static void finished(int x, int y) {
        checkMap[x][y] = true;
//検証用
//System.out.print("checkMap[" + x + "][" + y + "]を");     
//System.out.print("trueに変えました");     

        if(x + 1 < 12 && islandMap[x+1][y]==1 && !checkMap[x+1][y]) {
//検証用
//System.out.print("checkMap[" + x + "][" + y + "]の");     
//System.out.print("下に来きました");
            finished(x+1,y);

        }
        if(y + 1 < 12 && islandMap[x][y+1]==1 && !checkMap[x][y+1]) {
//検証用
//System.out.print("checkMap[" + x + "][" + y + "]の");     
//System.out.print("右に来ました");
            finished(x,y+1);

        }        
        if(y - 1 >= 0 && islandMap[x][y-1]==1 && !checkMap[x][y-1]) {
//System.out.print("checkMap[" + x + "][" + y + "]の");     
//System.out.print("左に来ました");
            finished(x,y-1);

        }
        if(x - 1 >= 0 && islandMap[x-1][y]==1 && !checkMap[x-1][y]) {
//System.out.print("checkMap[" + x + "][" + y + "]の");     
//System.out.print("上に来ました");
            finished(x-1,y);

        }           
    }
}

