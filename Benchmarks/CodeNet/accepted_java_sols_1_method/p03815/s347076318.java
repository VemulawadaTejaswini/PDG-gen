
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long move = (num / 11) * 2;
        if (num % 11 == 0) {
        } else if (num % 11 <= 6) {
            move++;
        } else {
            move += 2;
        }
        System.out.println(move);
        bw.flush();
    }
}
