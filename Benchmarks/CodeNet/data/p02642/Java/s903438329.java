import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.math.*;

public class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
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
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
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

        public long[] nextLongArray(int n) throws NumberFormatException, IOException {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        public int[] nextIntArray(int n) throws NumberFormatException, IOException {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            if(n==1){
                System.out.println(1);
                return;
            }
            List<Integer> list= new ArrayList<>();
            for (int i = 0; i < n; i++) {
              list.add(sc.nextInt());
            }
            Collections.sort(list);
            Set<Integer> doubleSet= new HashSet<>();
            if(list.get(0)==1){
                if(list.size()>=2 &&list.get(1)==1){
                    System.out.println(0);
                    return;
                }else{
                    System.out.println(1);
                    return;
                }
            }
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i)==list.get(i+1)){
                    doubleSet.add(list.get(i));
                    list.remove(i);
                    i--;
                }
            }
              

            for(int k = 0; k < list.size(); k++) {
                if(list.get(k)>=500001) {
                    break;
                }
                if(list.size()==1) {
                    break;
                }
                for(int i = k+1; i < list.size(); i++) {
                    if(list.get(i) % list.get(k)==0){
                        list.remove(i);
                        i--;
                    }
                }
            }
            for(int k = 0; k < list.size(); k++) {
                if(doubleSet.contains(list.get(k))){
                    list.remove(k);
                    k--;
                }
            }
            System.out.println(list.size());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
