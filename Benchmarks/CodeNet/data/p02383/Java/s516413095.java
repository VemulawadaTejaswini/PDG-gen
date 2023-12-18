import java.io.*;

class Dice{
    int[] sides = new int[6];
    int j = 0;

    Dice(int[] sides){
        this.sides = sides;
    }

    void N(){
        int tmp = sides[0];
        sides[0] = sides[1];
        sides[1] = sides[5];
        sides[5] = sides[4];
        sides[4] = tmp;
    }

    void S(){
        int tmp = sides[0];
        sides[0] = sides[4];
        sides[4] = sides[5];
        sides[5] = sides[1];
        sides[1] = tmp;
    }

    void W(){
        int tmp = sides[0];
        sides[0] = sides[2];
        sides[2] = sides[5];
        sides[5] = sides[3];
        sides[3] = tmp;
    }

    void E(){
        int tmp = sides[0];
        sides[0] = sides[3];
        sides[3] = sides[5];
        sides[5] = sides[2];
        sides[2] = tmp;
    }

    int getSide(int i){
        return sides[i];
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        char[] order = br.readLine().toCharArray();
        int[] sides = new int[6];

        for(int i = 0; i < 6; i++){
            sides[i] = Integer.parseInt(str[i]);
        }

        Dice dice = new Dice(sides);

        for(char c : order){
            switch (c){
                case 'N':
                    dice.N();
                    break;
                case 'S':
                    dice.S();
                    break;
                case 'E':
                    dice.E();
                    break;
                case 'W':
                    dice.W();
                    break;
                default:
                    break;
            }
        }
        System.out.println(dice.getSide(0));
    }
}