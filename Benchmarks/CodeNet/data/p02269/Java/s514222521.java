import java.io.*;
import java.util.HashSet;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<String> dictionary = new HashSet<String>();

        int n = Integer.parseInt(br.readLine());
        String[] input;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            if (input[0].equals("insert")) {
                dictionary.add(input[1]);
            } else {
                sb.append(dictionary.contains(input[1]) ? "yes" : "no").append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}