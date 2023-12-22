import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            list.add(new Integer(sc.next()));
        }
        sc.close();
        Collections.sort(list);

        double max = list.get(0);
        for (int i = 1; i < N; i++) {
            double temp = max;
            max = (temp + list.get(i)) / 2.0;
        }

        out.printf("%.10f\n", max);
        out.flush();
    }
}
