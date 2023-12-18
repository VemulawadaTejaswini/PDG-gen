import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Scanner sc;
    private static int[][] neg8 = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
    private static int[][] neg4 = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            while (true) {
                int w, h;
                w = sc.nextInt();
                h = sc.nextInt();
                if (w == 0 && h == 0) {
                    break;
                }

                char[][] arr = new char[h][w];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        arr[i][j] = sc.next().charAt(0);
                    }
                }

                int count = 0;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (arr[i][j] == '1') {
                            count++;
                            dfs(arr, i, j);
                        }
                    }
                }
                System.out.println(count);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void dfs(char[][] arr, int i, int j) {
        try {
            if (arr[i][j] == '0') {
                return;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }

        arr[i][j] = '0';

        for (int[] ints : neg8) {
            dfs(arr, i + ints[0], j + ints[1]);
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    private static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }
}


