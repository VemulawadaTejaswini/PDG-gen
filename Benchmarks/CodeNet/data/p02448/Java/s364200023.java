import java.util.*;
// import java.io.*;
// import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Item> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(new Item(sc.nextInt()
                , sc.nextInt()
                , sc.next()
                , sc.nextLong()
                , sc.next()));
        }

        Collections.sort(array, Comparator.comparing(Item::getV)
            .thenComparing(Item::getW)
            .thenComparing(Item::getT)
            .thenComparing(Item::getD)
            .thenComparing(Item::getS));

        for (int i = 0; i < array.size(); i++) {
            Item tmp = array.get(i);
            sb.append(tmp.v).append(" ");
            sb.append(tmp.w).append(" ");
            sb.append(tmp.t).append(" ");
            sb.append(tmp.d).append(" ");
            sb.append(tmp.s).append("\n");
            // if (i != array.size() - 1) sb.append(' ');
        }

        System.out.print(sb);
        
        sc.close();
    }

    static class Item {
        int v;
        int w;
        String t;
        long d;
        String s;

        Item(int a, int b, String c, long f, String e) {
            v = a;
            w = b;
            t = c;
            d = f;
            s = e;
        }

        int getV() { return v; }
        int getW() { return w; }
        String getT() { return t; }
        long getD() { return d; }
        String getS() { return s; }
    }
}

