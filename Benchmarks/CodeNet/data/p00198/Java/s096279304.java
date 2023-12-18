import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int ans;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> color = new HashMap<String, Integer>();
        color.put("Red", 1);
        color.put("Yellow", 2);
        color.put("Blue", 3);
        color.put("Magenta", 4);
        color.put("Green", 5);
        color.put("Cyan", 6);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < n; i++) {
                Dice d = new Dice(color.get(sc.next()), color.get(sc.next()),
                        color.get(sc.next()), color.get(sc.next()),
                        color.get(sc.next()), color.get(sc.next()));
                for (int j = 0; j < 4; j++) {
                    d = d.North();
                    for (int k = 0; k < 4; k++) {
                        d = d.Right();
                        set.add(d.toString());
                    }
                }
                d = d.East();
                for (int k = 0; k < 4; k++) {
                    d = d.Right();
                    set.add(d.toString());
                }
                d = d.East().East();
                for (int k = 0; k < 4; k++) {
                    d = d.Right();
                    set.add(d.toString());
                }
            }
            System.out.println(n - set.size() / 24);
        }
    }
}

class Dice {
    Integer cs[] = new Integer[7];

    Dice(Integer c1, Integer c2, Integer c3, Integer c4, Integer c5, Integer c6) {
        cs[1] = c1;
        cs[2] = c2;
        cs[3] = c3;
        cs[4] = c4;
        cs[5] = c5;
        cs[6] = c6;
    }

    public Dice North() {
        return new Dice(cs[2], cs[6], cs[3], cs[4], cs[1], cs[5]);
    }

    public Dice East() {
        return new Dice(cs[4], cs[2], cs[1], cs[6], cs[5], cs[3]);
    }

    public Dice Right() {
        return new Dice(cs[1], cs[4], cs[2], cs[5], cs[3], cs[6]);
    }

    public String toString() {
        return Arrays.toString(cs);
    }
}