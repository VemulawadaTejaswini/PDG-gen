import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());

        int[][] intervals = new int[h][2];
        for (int i = 0; i < h; i++) {
            tokenizer = new StringTokenizer(f.readLine());
            intervals[i][0] = Integer.parseInt(tokenizer.nextToken()) - 1;
            intervals[i][1] = Integer.parseInt(tokenizer.nextToken()) - 1;
        }

        TreeSet<int[]> startAndEnd = new TreeSet<int[]>(new ArrayComparator());
        TreeSet<int[]> differences = new TreeSet<int[]>(new ArrayComparator());
        for (int i = 0; i < w; i++) {
            int[] pair = {i, i};
            startAndEnd.add(pair);
            int[] pair2 = {i, 0};
            differences.add(pair2);
        }


        for (int h1 = 0; h1 < h; h1++) {
            if (startAndEnd.isEmpty()) {
                out.println(-1);
                continue;
            }


            //System.out.println();
            int a = intervals[h1][0];
            int b = intervals[h1][1];
            int[] ar = {Integer.MAX_VALUE, a};
            SortedSet<int[]> notBeforeA = startAndEnd.tailSet(ar, true);
            int[] best = notBeforeA.first();
            ArrayList<int[]> removeInStartAndEnd = new ArrayList<int[]>();
            for (int[] toRemove : notBeforeA) {
                if (toRemove[1] > b) break;
                removeInStartAndEnd.add(toRemove);
                int[] removeDiff = {toRemove[0], toRemove[1] - toRemove[0]};
                differences.remove(removeDiff);
            }
            for (int[] toRemove : removeInStartAndEnd){
                startAndEnd.remove(toRemove);
            }
            if (b + 1 != w) {
                best[1] = b + 1;
                startAndEnd.add(best);
                int[] diff = {best[0], best[1]- best[0]};
                differences.add(diff);
            }

            //System.out.println();
            if (startAndEnd.isEmpty()) {
                out.println(-1);
                continue;
            }
            out.println(differences.first()[1] + h1 + 1);
        }


        out.close();
    }

    private static class ArrayComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {
            int compare1 = Integer.compare(o1[1], o2[1]);
            if (compare1 != 0) return compare1;
            return Integer.compare(o1[0], o2[0]) * -1;
        }
    }
}