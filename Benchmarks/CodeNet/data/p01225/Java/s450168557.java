import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] number;
    private static char[] color;
    private static int[] combination;
    private static int[][] box;

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();

        for(int i = 0; i < count; i++){
            number = new int[9];
            color = new char[9];
            combination = new int[3];

            for(int j = 0; j < 9; j++) number[j] = scn.nextInt();
            for(int j = 0; j < 9; j++) color[j] = scn.next().charAt(0);
            box = new int[3][3];


            if(solve(0)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }

    public static boolean solve(int n){

        if(n == 9){
            for(int i = 0; i < 3; i++){
                //三色同じか判定
                if( color[box[i][0]]!= color[box[i][1]] || color[box[i][1]] != color[box[i][2]] ) {
                    return false;
                }
            }

            for(int i = 0; i < 3; i++){
                int[] tmp = new int[3];

                for(int j = 0; j < 3; j++) {
                    tmp[j] = number[box[i][j]];
                }
                Arrays.sort(tmp);
                if( !( tmp[0] == tmp[1] && tmp[1] == tmp[2] || tmp[0] + 1 == tmp[1] && tmp[1] + 1 == tmp[2] ) ){
                    return false;
                }
            }
            return true;
        }

        for(int i = 0; i < 3; i++){
            if(combination[i] == 3) continue;
            box[i][combination[i]] = n;
            combination[i]++;
            if( solve(n + 1) ) return true;
            combination[i]--;
        }
        return false;
    }
}

