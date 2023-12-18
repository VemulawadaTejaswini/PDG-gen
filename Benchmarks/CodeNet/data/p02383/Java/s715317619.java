import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Dice {
    int top;
    int bottom;
    int left;
    int right;
    int front;
    int back;

    static Dice of (int[] init) {
        Dice d = new Dice();
        d.top = init[0];
        d.bottom = init[5];
        d.left = init[3];
        d.right = init[2];
        d.front = init[1];
        d.back = init[4];
        return d;
    }

    static Dice of (Dice copy) {
        Dice d = new Dice();
        d.top = copy.top;
        d.bottom = copy.bottom;
        d.left = copy.left;
        d.right = copy.right;
        d.front = copy.front;
        d.back = copy.back;
        return d;
    }

    void E () {
        Dice copy = Dice.of(this);
        top = copy.left;
        bottom = copy.right;
        left = copy.bottom;
        right = copy.top;
    }

    void N () {
        Dice c = Dice.of(this);
        top = c.front;
        bottom = c.back;
        front = c.bottom;
        back = c.top;
    }

    void S () {
        Dice c = Dice.of(this);
        top = c.back;
        bottom = c.front;
        front = c.top;
        back = c.bottom;
    }

    void W () {
        Dice c = Dice.of(this);
        top = c.right;
        bottom = c.left;
        left = c.top;
        right = c.bottom;
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Dice dice = Dice.of(arr);

            String[] orders = in.readLine().split("");
            for (int i = 0; i < orders.length; i++) {
                switch (orders[i]) {
                    case "E":
                        dice.E();
                        break;
                    case "N":
                        dice.N();
                        break;
                    case "S":
                        dice.S();
                        break;
                    case "W":
                        dice.W();
                        break;
                }
            }

            System.out.println(dice.top);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

