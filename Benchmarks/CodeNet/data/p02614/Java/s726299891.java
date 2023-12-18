import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solver = new Solution();
        solver.solve(1, in, out);
        out.close();
    }

    static class Solution {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int finalCount = 0;

            int row = in.nextInt();
            int column = in.nextInt();
            int k = in.nextInt();

            char[][] matrix = new char[row][column];

            for (int i = 0; i < row; i++) {
                String s = in.next();
                int col = 0;
                for (char c : s.toCharArray()) {
                    matrix[i][col] = c;
                    col ++;
                }
            }

            ArrayList<int[]> rows = gen(row);
            ArrayList<int[]> columns = gen(column);

            for (int[] r : rows) {
                for (int[] c : columns) {
                    int count = 0;
                    for (int i = 0; i < row; i ++) {
                        for (int j = 0; j < column; j ++) {
                            if (!contains(r, i) && !contains(c, j) && matrix[i][j] == '#' ) {
                                count++;
                            }
                        }
                    }

                    if (count == k) {
                        finalCount++;
                    }


                }
            }
            System.out.println(finalCount);
        }


        public static Boolean contains( int[] arr, int i){
            for (int a : arr) {
                if (a == i) return true;
            }

            return false;

        }

        public static ArrayList<int[]> gen (int row) {
            ArrayList<int[]> rowsFinal = new ArrayList<>();
            if (row == 0) {
                int[] arr = {};
                rowsFinal.add(arr);
                return rowsFinal;
            }
            else  {
                ArrayList<int[]> pre = gen(row -1 );
                for ( int[] ar : pre) {
                    int[] next = new int[ar.length + 1];
                    for (int i = 0; i < ar.length; i++) {
                        next[i]= ar[i];
                    }
                    next[ar.length] = row-1 ;
                    rowsFinal.add(next);
                }
                rowsFinal.addAll(pre);
            }
            return  rowsFinal;

        }

    }






    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String inputLine = "";
            try {
                inputLine = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inputLine;
        }
    }
}
