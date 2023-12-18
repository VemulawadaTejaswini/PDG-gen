
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String odd = br.readLine();
        String even = br.readLine();
        String merge = odd + even;
        String s = "";
        int o = 0, e = 0;
        for (int i = 0; i < merge.length(); i++) {
            if (i % 2 == 0) {
                s += odd.charAt(o++);
            } else {
                s += even.charAt(e++);
            }
        }
        System.out.println(s);
        bw.flush();
    }
}
