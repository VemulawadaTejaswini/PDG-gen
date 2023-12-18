import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Dice {
    int top;
    int bottom;
    int left;
    int right;
    int front;
    int back;

    static Dice of (int[] init) {
        Dice d = new Dice();
        // [top front right left back bottom]
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

    int[] toArray () {
        int[] arr = new int[6];
        arr[0] = top;
        arr[1] = front;
        arr[2] = right;
        arr[3] = left;
        arr[4] = back;
        arr[5] = bottom;
        return arr;
    }

    // roll to right
    void E () {
        Dice copy = Dice.of(this);
        top = copy.left;
        bottom = copy.right;
        left = copy.bottom;
        right = copy.top;
    }

    // roll to back
    void N () {
        Dice c = Dice.of(this);
        top = c.front;
        bottom = c.back;
        front = c.bottom;
        back = c.top;
    }

    // roll to front
    void S () {
        Dice c = Dice.of(this);
        top = c.back;
        bottom = c.front;
        front = c.top;
        back = c.bottom;
    }

    // roll to left
    void W () {
        Dice c = Dice.of(this);
        top = c.right;
        bottom = c.left;
        left = c.top;
        right = c.bottom;
    }

    void toTop (int n) {
        if (n == bottom) {
            E();
            E();
        } else if (n == left) {
            E();
        } else if (n == right) {
            W();
        } else if (n == front) {
            N();
        } else if (n == back) {
            S();
        }
    }

    void toFront (int n) {
        if (n == top) {
            S();
        } else if (n == bottom) {
            N();
        } else if (n == left) {
            E();
            S();
        } else if (n == right) {
            W();
            S();
        } else if (n == back) {
            S();
            S();
        }
    }

    boolean equals (Dice d) {
        String allPattern = "EEENEEENEEESEEESEEENEEEN";
        int[] arr1 = toArray();
        boolean isSame = Arrays.equals(arr1, d.toArray());
        for (int i = 0; i < allPattern.length(); i++) {
            if (isSame) break;
            switch (allPattern.charAt(i)) {
                case 'E':
                    d.E();
                    break;
                case 'N':
                    d.N();
                    break;
                case 'S':
                    d.S();
                    break;
                case 'W':
                    d.W();
                    break;
            }
            isSame = Arrays.equals(arr1, d.toArray());
        }
        return isSame;
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            List<Dice> arr = new ArrayList<>();
            boolean allDifferent = true;
            for (int i = 0; i < n; i++) {
                if (!allDifferent) break;

                Dice d = Dice.of(
                        Arrays.stream(in.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray());

                for (int j = 0; j < arr.size(); j++) {
                    if (d.equals(arr.get(j))) {
                        allDifferent = false;
                        break;
                    }
                }
                arr.add(d);
            }

            if (allDifferent) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

