
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int[] DiceBox = new int[6];
        for(int i = 0; i < 6; i++){
            DiceBox[i] = scan.nextInt();
        }

        Dice dice = new Dice(DiceBox[0], DiceBox[1], DiceBox[2], DiceBox[3], DiceBox[4], DiceBox[5]);
        String line = scan.next();
        int i = 0;
        while(true){

            if(i == line.length()){
                break;
            }
            switch(line.charAt(i)){
                case 'N':
                    dice.TurnN();
                    break;
                case 'E':
                    dice.TurnE();
                    break;
                case 'S':
                    dice.TurnS();
                    break;
                case 'W':
                    dice.TurnW();
                    break;
            }

            i++;

        }
        
        System.out.println(dice.Top);


    }
}

class Dice {
    int Top;
    int Bottom;
    int N;
    int S;
    int W;
    int E;

    Dice(int a, int b, int c, int d, int e, int f){
        Top = a;
        S = b;
        E = c;
        W = d;
        N = e;
        Bottom = f;
    }

    public void TurnN() {
        int tmp = Top;
        Top = S;
        S = Bottom;
        Bottom = N;
        N = tmp;
    }

    public void TurnS() {
        int tmp = Bottom;
        Bottom = S;
        S = Top;
        Top = N;
        N = tmp;
    }

    public void TurnW() {
        int tmp = Bottom;
        Bottom = W;
        W = Top;
        Top = E;
        E = tmp;
    }

    public void TurnE() {
        int tmp = Bottom;
        Bottom = E;
        E = Top;
        Top = W;
        W = tmp;
    }
}

