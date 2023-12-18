import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Rectangle> data = read();
        new Main().solve(data);
    }

    static Comparator<Rectangle> comparator = (Rectangle o1, Rectangle o2) -> {
        if (o1.v() == o2.v()) {
            return o2.h - o1.h;
        }
        return o1.v() - o2.v();
    };

    static List<Rectangle> list = new ArrayList<>();
    static {
        for (int i = 1; i < 150; i++) {
            for (int j = 1; j < i; j++) {
                list.add(new Rectangle(j, i));
            }
        }
        list.sort(comparator);
    }

    void solve(List<Rectangle> list) {
        for(Rectangle rec: list) {
            int i = this.list.indexOf(rec);
            Rectangle next = this.list.get(i + 1);
            System.out.println(next.toString());
        }
    }

    static class Rectangle {
        final int w;
        final int h;

        public Rectangle(int w, int h) {
            this.w = w;
            this.h = h;
        }

        public int v() {
            return (this.w * this.w) + (this.h * this.h);
        }

        @Override
        public boolean equals(Object obj) {
            Rectangle rec = (Rectangle) obj;
            return rec.w == this.w && rec.h == this.h;
        }

        @Override
        public int hashCode() {
            return v() * 150 + h;
        }

        @Override
        public String toString() {
            return String.valueOf(this.w) + " " + String.valueOf(this.h);
        }
    }

    static List<Rectangle> read() {
        Scanner sc = new Scanner(System.in);
        List<Rectangle> list = new ArrayList<>();

        while (true) {
            Rectangle req = readLine(sc.nextLine());
            if (req == null) {
                break;
            } else {
                list.add(req);
            }
        }
        sc.close();

        return list;
    }

    static Rectangle readLine(String line) {
        String[] split = line.split(" ");
        int w = Integer.parseInt(split[0]);
        int h = Integer.parseInt(split[1]);
        if (w == 0 && h == 0) {
            return null;
        } else {
            return new Rectangle(w, h);
        }
    }


}

