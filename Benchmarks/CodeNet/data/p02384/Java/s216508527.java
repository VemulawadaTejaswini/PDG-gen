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
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split(" ");
        int[] sides = new int[6];
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < 6; i++){
            sides[i] = Integer.parseInt(str[i]);
        }
        Dice dice = new Dice(sides);

        for(int i = 0; i < n; i++){
            String[] line = br.readLine().split(" ");
            int upper = Integer.parseInt(line[0]);
            int front = Integer.parseInt(line[1]);
            int cnt = 0;
            while(dice.getSide(0) != upper){
                if(cnt % 4 == 3){
                    dice.E();
                }else{
                    dice.N();
                }
                cnt++;
            }
            dice.W();
            while(dice.getSide(0) != front){
                dice.N();
            }
            sb.append(dice.getSide(4)).append("\n");
        }
        System.out.print(sb.toString());
    }
}