import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[6];
        for(int i = 0; i < 6; i++){
            dice[i] = sc.nextInt();
        }
        String order = sc.next();
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            int[] temp = new int[6];
            if(c == 'E'){
                temp[0] = dice[3];
                temp[1] = dice[1];
                temp[2] = dice[0];
                temp[3] = dice[5];
                temp[4] = dice[4];
                temp[5] = dice[2];
            }else if(c == 'W'){
                temp[0] = dice[2];
                temp[1] = dice[1];
                temp[2] = dice[5];
                temp[3] = dice[0];
                temp[4] = dice[4];
                temp[5] = dice[3];
            }else if(c == 'N'){
                temp[0] = dice[1];
                temp[1] = dice[5];
                temp[2] = dice[2];
                temp[3] = dice[3];
                temp[4] = dice[0];
                temp[5] = dice[4];
            }else if(c == 'S'){
                temp[0] = dice[4];
                temp[1] = dice[0];
                temp[2] = dice[2];
                temp[3] = dice[3];
                temp[4] = dice[5];
                temp[5] = dice[1];
            }
            dice = temp;
        }
        System.out.println(dice[0]);
    }
}

