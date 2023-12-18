import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> dictionary = new ArrayList<String>();

        int n = Integer.parseInt(br.readLine());
        String[] input;
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            if (input[0].equals("insert")) {
                dictionary.add(input[1]);
            } else {
                System.out.println(dictionary.contains(input[1]) ? "yes" : "no");
            }
        }

    }
}