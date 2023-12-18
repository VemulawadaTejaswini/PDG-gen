
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dice_argument = new int[6];
        for(int i = 0; i < 6; i++){
            dice_argument[i] = scan.nextInt();
        }
        Dice dice = new Dice(dice_argument[0], dice_argument[1], dice_argument[2], dice_argument[3], dice_argument[4], dice_argument[5]);

        int x = scan.nextInt();
        int a1;
        int a2;
        for(int i = 0; i < x; i++){
            a1 = scan.nextInt();
            a2 = scan.nextInt();
            dice.fix_position(a1, a2);
        }
    }

}

class Dice {
    int Top;
    int N;
    int E;
    int W;
    int S;
    int Bottom;

    Dice(int a, int b, int c, int d, int e, int f){
        Top = a;
        S = b;
        E = c;
        W = d;
        N = e;
        Bottom = f;
    }

    public void fix_position (int top, int front) {

        while(true){

            if(Top == top){
                break;
            }
            rollN();
            turnR();
        }

        while(true){
            if(N == front){
                break;
            }
            turnR();
        }
        
        System.out.println(E);

    }

    public void rollN () {
        int tmp = Top;
        Top = S;
        S = Bottom;
        Bottom = N;
        N = tmp;
    }

    public void turnR () {
        int tmp = E;
        E = N;
        N = W;
        W = S;
        S = tmp;
    }



}

