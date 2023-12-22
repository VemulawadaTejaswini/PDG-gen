
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String s = br.readLine();
        int count = 0, i = 0;
        char c = s.charAt(0);
        while (i < s.length() - 1) {
            if (s.charAt(i + 1) == c) {
            } else {
                c = s.charAt(i + 1);
                count++;
            }
            i++;
        }
        System.out.println(count);
        bw.flush();
    }
}
