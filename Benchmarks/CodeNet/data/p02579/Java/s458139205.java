import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        private Integer[][] res;
        private boolean[][] a;
        private DWizardInMaze.MyPair posInit;
        private DWizardInMaze.MyPair posFin;
        private int r;
        private int c;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            r = in.nextInt();
            c = in.nextInt();
            posInit = new DWizardInMaze.MyPair(in.nextInt() - 1, in.nextInt() - 1);
            posFin = new DWizardInMaze.MyPair(in.nextInt() - 1, in.nextInt() - 1);
            a = in.nextMatBool(r, c, '#');
            int res = solveMe();
            //out.print("Case #"+ testNumber + ": ");
            out.print(res);
        }

        private int solveMe() {
            res = new Integer[r][c];
            res[((int) posInit.first)][(int) posInit.second] = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (a[i][j])
                        res[i][j] = -1;
                }
            }
            ArrayList<DWizardInMaze.MyPair> list = new ArrayList<>();
            list.add(posInit);
            //d("list = " + stringMeDeb(res));
            list = fillMe(list);
            //d("AFTER FILLME : res = " + stringMeDeb(res)+ ": list = " + stringMeDeb(list.toArray(new MyPair[0])));
            while (!list.isEmpty()) {
                list = applyWand(list);
                //d("AFTER APPLYWAND : res = " + stringMeDeb(res) + ": list = " + stringMeDeb(list.toArray(new MyPair[0])));
                list = fillMe(list);
                //d("AFTER FILLME : res = " + stringMeDeb(res) + ": list = " + stringMeDeb(list.toArray(new MyPair[0])));
            }
            Integer ans = res[(int) posFin.first][(int) posFin.second];
            return ans == null ? -1 : ans;
        }

        private ArrayList<DWizardInMaze.MyPair> applyWand(ArrayList<DWizardInMaze.MyPair> list) {
            ArrayList<DWizardInMaze.MyPair> newList = new ArrayList<>();
            for (DWizardInMaze.MyPair start : list) {
                applyWandRec(start, newList);
            }
            return newList;
        }

        private void applyWandRec(DWizardInMaze.MyPair start, ArrayList<DWizardInMaze.MyPair> list) {
            int[][] moves = new int[][]{{-2, -2}, {-2, -1}, {-2, 0}, {-2, 1}, {-2, 2}, {-1, 2}, {0, 2}, {1, 2}, {2, 2}, {2, 1}, {2, 0}, {2, -1}, {2, -2}, {1, -2}, {0, -2}, {-1, -2}};
            for (int i = 0; i < moves.length; i++) {
                int x = (int) start.first;
                int y = (int) start.second;
                int newX = x + moves[i][0];
                int newY = y + moves[i][1];
                DWizardInMaze.MyPair newStart = new DWizardInMaze.MyPair(newX, newY);
                if (newStart.first < 0 || newStart.first >= r || newStart.second < 0 || newStart.second >= c)
                    continue;
                if (res[newX][newY] != null && res[newX][newY] == -1)
                    continue;
                if (res[newX][newY] == null) {
                    res[newX][newY] = res[x][y] + 1;
                    list.add(newStart);
                }
            }
        }

        private ArrayList<DWizardInMaze.MyPair> fillMe(ArrayList<DWizardInMaze.MyPair> list) {
            ArrayList<DWizardInMaze.MyPair> newList = new ArrayList<>(list);
            for (DWizardInMaze.MyPair start : list) {
                fillMeRec(start, newList);
            }
            return newList;
        }

        private void fillMeRec(DWizardInMaze.MyPair start, ArrayList<DWizardInMaze.MyPair> list) {
            int[][] moves = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int i = 0; i < moves.length; i++) {
                int x = (int) start.first;
                int y = (int) start.second;
                int newX = x + moves[i][0];
                int newY = y + moves[i][1];
                DWizardInMaze.MyPair newStart = new DWizardInMaze.MyPair(newX, newY);
                if (newStart.first < 0 || newStart.first >= r || newStart.second < 0 || newStart.second >= c)
                    continue;
                if (res[newX][newY] != null && res[newX][newY] == -1)
                    continue;
                if (res[newX][newY] == null) {
                    res[newX][newY] = res[x][y];
                    list.add(newStart);
                    fillMeRec(newStart, list);
                }
            }

        }

        private static class MyPair implements Comparable<DWizardInMaze.MyPair> {
            long first;
            long second;

            public MyPair(long first, long second) {
                this.first = first;
                this.second = second;
            }

            public MyPair(DWizardInMaze.MyPair other) {
                this.first = other.first;
                this.second = other.second;
            }

            public String toString() {
                //return "[" + first + ", " + second + "]";
                return first + ";" + second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DWizardInMaze.MyPair myPair = (DWizardInMaze.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(DWizardInMaze.MyPair p2) {
                int res = Long.compare(first, p2.first);
                return res != 0 ? res : Long.compare(second, p2.second);
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public boolean[][] nextMatBool(int r, int c, char isTrue) {
            boolean[][] a = new boolean[r][c];
            for (int i = 0; i < r; i++) {
                String s = next();
                for (int j = 0; j < c; j++) {
                    a[i][j] = s.charAt(j) == isTrue;
                }
            }
            return a;
        }

    }
}

