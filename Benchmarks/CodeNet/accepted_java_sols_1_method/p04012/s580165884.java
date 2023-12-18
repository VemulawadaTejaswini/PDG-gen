
import java.io.*;
import java.util.*;
//import java.util.stream.*;;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        char ch[] = br.readLine().toCharArray();
        int array[] = new int[26];
        String s = "Yes";
        for (int i = 0; i < ch.length; i++) {
            array[ch[i] - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] % 2 != 0 && array[i] != 0) {
                s = "No";
                break;
            }
        }
        System.out.println(s);
        bw.flush();
    }
}
