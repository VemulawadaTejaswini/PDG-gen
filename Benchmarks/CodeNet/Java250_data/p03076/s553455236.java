import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int getNextOrderTime(int time) {
        return time + ((10 - time % 10) % 10);
    }

    public int calc(List<Integer> A, List<Integer> C, int min) {
        if (C.size() == 5) {
            min = Math.min(min, simulate(C));
            return min;
        }

        for (int i = 0; i < A.size(); i++) {
            List<Integer> a = new LinkedList<>(A);
            List<Integer> l = new LinkedList<>(C);
            int v = a.get(i);
            a.remove(i);
            l.add(v);
            min = Math.min(min, calc(a, l, min));
        }
        return min;
    }

    public int simulate(List<Integer> A) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int time = A.get(i);
            if (i == 4) {
                sum += time;
            } else {
                sum += getNextOrderTime(time);
            }
        }
        return sum;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new LinkedList<Integer>();
        A.add(sc.nextInt());
        A.add(sc.nextInt());
        A.add(sc.nextInt());
        A.add(sc.nextInt());
        A.add(sc.nextInt());

        int min = calc(A, new LinkedList<Integer>(), Integer.MAX_VALUE);
        System.out.println(min);

        return;
    }

}
