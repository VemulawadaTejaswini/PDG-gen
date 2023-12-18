
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());

        if (n == 1) {
            int a = Integer.parseInt(scan.next());
            System.out.println((a + k) / (k + 1));
            scan.close();
            return;
        }

        TreeSet<Maruta> set = new TreeSet<Maruta>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.next());
            set.add(new Maruta(i, a, 1, a));
        }
        scan.close();

        while (true) {
            Maruta first = set.pollFirst();
            Maruta second = set.pollFirst();

            int updatedDivide = (first.start + second.now - 1) / second.now;
            if (updatedDivide - first.divide >= k) {
                first.update(first.divide + k);
                set.add(first);
                set.add(second);
                break;
            }

            k -= updatedDivide - first.divide;
            first.update(updatedDivide);
            set.add(first);
            set.add(second);

        }

        System.out.println(set.first().now);
    }

    static class Maruta implements Comparable<Maruta> {
        int id;
        int now;
        int divide;
        int start;

        public Maruta(int id, int now, int divide, int start) {
            this.id = id;
            this.now = now;
            this.divide = divide;
            this.start = start;
        }

        public void update(int divide) {
            this.divide = divide;
            this.now = (start + divide - 1) / divide;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + divide;
            result = prime * result + id;
            result = prime * result + now;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Maruta other = (Maruta)obj;
            if (divide != other.divide)
                return false;
            if (id != other.id)
                return false;
            if (now != other.now)
                return false;
            return true;
        }

        @Override
        public int compareTo(Maruta o) {
            if (now != o.now) {
                return o.now - now;
            } else if (divide != o.divide) {
                return divide - o.divide;
            } else {
                return id - o.id;
            }
        }
    }
}
