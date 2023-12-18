import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] map = new char[h][w];
        int[][] array = new int[h][w];
        for(int i=0;i<h;i++){
            map[i] = sc.next().toCharArray();
            int begin = 0;
            int end = 0;
            for(int j=0;j<w;j++){
                if(j==w-1 && map[i][j] == '.'){
                    end = w;
                    int sub = end - begin;
                    for(int k=begin; k<end; k++){
                        array[i][k] = sub;
                    }
                    continue;
                }
                if(map[i][j] == '#'){
                    end = j;
                    int sub = end - begin;
                    for(int k=begin; k<end; k++){
                        array[i][k] = sub;
                    }
                    array[i][j] = 0;
                    begin = j+1;
                }
            }
        }
        sc.close();
        int max = 0;
        for(int i=0;i<w;i++){
            int begin = 0;
            int end = 0;
            for(int j=0;j<h;j++){
                if(j==h-1 && map[j][i] == '.'){
                    end = h;
                    int sub = end - begin;
                    for(int k=begin; k<end; k++){
                        array[k][i] += sub;
                        if(max < array[k][i]){
                            max = array[k][i];
                        }
                    }
                    continue;
                }
                if(map[j][i] == '#'){
                    end = j;
                    int sub = end - begin;
                    for(int k=begin; k<end; k++){
                        array[k][i] += sub;
                        if(max < array[k][i]){
                            max = array[k][i];
                        }
                    }
                    array[j][i] = 0;
                    begin = j+1;
                }
            }
        }
        System.out.println(max-1);
    }
}