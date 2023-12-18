
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fishNum = scan.nextInt();

        HashMap<Key, Group> map = new HashMap<>();

        int a0 = 0, b0 = 0, a0b0 = 0;
        for (int i = 0; i < fishNum; i++) {
            long a = scan.nextLong();
            long b = scan.nextLong();

            if (a == 0 && b == 0) {
                a0b0++;
                continue;
            } else if (a == 0) {
                a0++;
                continue;
            } else if (b == 0) {
                b0++;
                continue;
            }


            long gcd = GCD(Math.abs(a), Math.abs(b));
            a = a / gcd;
            b = b / gcd;


            Key key = null;

            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                key = new Key(Math.abs(a), Math.abs(b), true);
            } else {
                key = new Key(Math.abs(b), Math.abs(a), false);
            }
            if (!map.containsKey(key)) {
                map.put(key, new Group(key));
            } else {
                Group group = map.get(key);
                group.addKey(key);
            }
        }

        long out = 1;
        for (Group group : map.values()) {
            long posNum = 1;
            for (int i = 0; i < group.getPos(); i++) {
                posNum = posNum * 2 % 1000000007;
            }
            long negNum = 1;
            for (int i = 0; i < group.getNeg(); i++) {
                negNum = negNum * 2 % 1000000007;
            }
            out = out * (negNum + posNum - 1) % 1000000007;
        }

        long posNum = 1;
        for (int i = 0; i < a0; i++) {
            posNum = posNum * 2 % 1000000007;
        }
        long negNum = 1;
        for (int i = 0; i < b0; i++) {
            negNum = negNum * 2 % 1000000007;
        }

        out = out * (negNum + posNum - 1) % 1000000007;

        out = (out + a0b0) % 1000000007;
        System.out.println(out - 1);

    }

    static long GCD(long a, long b) {
        if (b == 0) return a;
        return a % b == 0 ? b : GCD(b, a % b);
    }
}

class Group {
    long up;

    long low;

    public int getPos() {
        return pos;
    }

    public int getNeg() {
        return neg;
    }

    //    up/low
    int pos = 0;

    //    -low/up
    int neg = 0;

    public Group(Key key) {
        this.up = key.getUp();
        this.low = key.getLow();
        addKey(key);
    }

    public void addKey(Key key) {
        if (key.isPos()) {
            pos++;
        } else {
            neg++;
        }
    }
}

class Key {
    long up;
    long low;

    public long getUp() {
        return up;
    }

    public long getLow() {
        return low;
    }

    public boolean isPos() {
        return pos;
    }

    boolean pos;

    public Key(long up, long low, boolean pos) {
        this.up = up;
        this.low = low;
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return up == key.up &&
                low == key.low;
    }

    @Override
    public int hashCode() {
        return Objects.hash(up, low);
    }
}
