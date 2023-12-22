import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int x = Integer.parseInt(ar[0]);
        int y = Integer.parseInt(ar[1]);
        int[][] list = new int[x+1][y+1];
        for(int i = 0; i < x; i++){
            ar = br.readLine().split(" ");
            for(int j = 0; j < y; j++){
                list[i][j] = Integer.parseInt(ar[j]);
            }
        }
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                if(j == list[i].length-1){
                    System.out.println(list[i][j]);
                }else if(i == list.length-1){
                    list[i][y] += list[i][j];
                    System.out.print(list[i][j]+" ");
                }else{
                    list[i][y] += list[i][j];
                    list[x][j] += list[i][j];
                    System.out.print(list[i][j]+" ");
                }
            }
        }
    }
}