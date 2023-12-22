import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
          String[] aCards = sc.next().split("");
          String[] bCards = sc.next().split("");
          String[] cCards = sc.next().split("");

          String winner = "";
          String turn = "a";
          int firstA = 0;
          int firstB = 0;
          int firstC = 0;
          while(true) {
            if (turn.equals("a")) {
              if (aCards.length - 1 == firstA) {
                winner = "A";
                break;
              }
              turn = aCards[firstA];
              firstA++;
            } else if (turn.equals("b")) {
              if (bCards.length - 1 == firstB) {
                winner = "B";
                break;
              }
              turn = bCards[firstB];
              firstB++;
            } else {
              if (cCards.length - 1 == firstC) {
                winner = "C";
                break;
              }
              turn = cCards[firstC];
              firstC++;
            }
          }  

          System.out.println(winner);

        } catch (Exception e) {
            e.printStackTrace();
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
}
