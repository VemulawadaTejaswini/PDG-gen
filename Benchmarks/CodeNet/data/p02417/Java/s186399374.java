import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
        FastReader f = new FastReader();
        Scanner input = new Scanner(System.in);
        HashMap<Integer,Integer> histogram = new HashMap<>();
        // fill in the dictionary with the initial value
        for (int letter = 97; letter < 123; letter++) {
            histogram.put(letter, 0);
        }

        while(input.hasNextLine()) {
            // grab and convert the string to lowercase
            String line = input.nextLine().toLowerCase();
         
            // iterate over the char
            for (char ch : line.toCharArray()) {
                int key = (int) ch;
                if (histogram.containsKey(key)) {
                    int temp = histogram.get(key) + 1;
                    histogram.replace(key, temp);
                }
            }
        }
        displayHisto(histogram);
    }

    // Helper function for displaying histogram
    private static void displayHisto(HashMap<Integer, Integer> histogram) {
        for(int letter = 97; letter < 123; letter++) {
            System.out.println(String.valueOf(Character.toChars(letter)) + " : " + histogram.get(letter));
        }
    }

    // Helper class to speed up IO
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        boolean hasNext(){
            return st.hasMoreTokens();
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                str = "null";
                e.printStackTrace();
            }
            return str;
        }
    }
}

