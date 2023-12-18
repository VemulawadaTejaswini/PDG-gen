import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] dice = new int [6];
        for(int x = 0; x < 6; x++){
            dice[x] = scan.nextInt();
        }
        String d = scan.nextLine();
        d = scan.nextLine();
        for (int x = 0; x < d.length();x++){
            dice = roll(d.charAt(x),dice);
        }
        System.out.println(dice[0]);
    }
    public static int[] roll(char s, int dice[]){
        if(s == 'E'){
            int hold = dice[0];
            dice[0] = dice[3];
            dice[3] = dice[5];
            dice[5] = dice[2];
            dice[2] = hold;
        }
        else if(s == 'N'){
            int hold = dice[0];
            dice[0] = dice[1];
            dice[1] = dice[5];
            dice[5] = dice[4];
            dice[4] = hold;
        }
        else if(s == 'S'){
            int hold = dice[0];
            dice[0] = dice[4];
            dice[4] = dice[5];
            dice[5] = dice[1];
            dice[1] = hold;
        }
        else if(s == 'W'){
            int hold = dice[0];
            dice[0] = dice[2];
            dice[2] = dice[5];
            dice[5] = dice[3];
            dice[3] = hold;

        }
        return dice;
    }
}
