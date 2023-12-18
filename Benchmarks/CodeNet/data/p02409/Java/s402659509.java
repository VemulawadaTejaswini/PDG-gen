import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[][][] array = new int [4][3][10];
        for(int i = 0; i < x; i++){
            String[] str = br.readLine().split(" ");
            int house  = Integer.parseInt(str[0])-1;
            int floor  = Integer.parseInt(str[1])-1;
            int room   = Integer.parseInt(str[2])-1;
            int person = Integer.parseInt(str[3]);
            array[house][floor][room] += person;
        }
        for(int i = 0; i < array.length; i++){
            if(!(i ==0)){
                System.out.println("####################");
            }
            for(int j = 0; j < array[i].length; j++){
  
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.print(" "+array[i][j][k]);
                    if(k == array[i][j].length-1){
                        System.out.println("");
                    }
                }
            }
        }
    }
}