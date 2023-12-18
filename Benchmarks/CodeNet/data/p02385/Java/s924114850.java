import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dice1 = new int[6];
        int[] dice2 = new int[6];
        for (int x = 0; x < 6; x++) {
            dice1[x] = scan.nextInt();
        }
        for (int x = 0; x < 6; x++) {
            dice2[x] = scan.nextInt();
        }

        if(Arrays.equals(dice1,dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(dice1),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(dice1)),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(rotate(dice1))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(roll('E',dice1),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(roll('E',dice1)),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(roll('E',dice1))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(rotate(roll('E',dice1)))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(roll('E',roll('E',dice1)),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(roll('E',roll('E',dice1))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(roll('E',roll('E',dice1)))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(rotate(roll('E',roll('E',dice1))))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(roll('E', roll('E',roll('E',dice1))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(roll('E', roll('E',roll('E',dice1)))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(roll('E', roll('E',roll('E',dice1))))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(rotate(roll('E', roll('E',roll('E',dice1)))))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(roll('N',dice1),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(roll('N',dice1)),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(roll('N',dice1))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(rotate(roll('N',dice1)))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(roll('N',roll('N',roll('N',dice1))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(roll('N',roll('N',roll('N',dice1)))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(roll('N',roll('N',roll('N',dice1))))),dice2)){
            System.out.println("Yes");
        }
        else if(Arrays.equals(rotate(rotate(rotate(roll('N',roll('N',roll('N',dice1)))))),dice2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
    public static int[] roll(char s, int dice[]) {
        if (s == 'E') {
            int hold = dice[0];
            dice[0] = dice[3];
            dice[3] = dice[5];
            dice[5] = dice[2];
            dice[2] = hold;
        }
        else if (s == 'N') {
            int hold = dice[0];
            dice[0] = dice[1];
            dice[1] = dice[5];
            dice[5] = dice[4];
            dice[4] = hold;
        }
        else if (s == 'S') {
            int hold = dice[0];
            dice[0] = dice[4];
            dice[4] = dice[5];
            dice[5] = dice[1];
            dice[1] = hold;
        }
        else if (s == 'W') {
            int hold = dice[0];
            dice[0] = dice[2];
            dice[2] = dice[5];
            dice[5] = dice[3];
            dice[3] = hold;
        }
        return dice;
    }
    public static int[] rotate(int dice[]){
        int hold = dice[1];
        dice[1] = dice[3];
        dice[3] = dice[4];
        dice[4] = dice[2];
        dice[2] = hold;
        return dice;
    }
}
