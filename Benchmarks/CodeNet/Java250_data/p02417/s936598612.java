import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabetList = new int[26];
        String line;
        while (null != (line = br.readLine())) {
            for (int c : line.toCharArray()) {
                c = c >= 65 && c <= 90 ? c - 65 : c >= 97 && c <= 122 ? c - 97 : c;
                if (c >= 0 && c <= 26) {
                    alphabetList[c]++;
                }
            }
        }
        int n = 0;
        for (int i : alphabetList) {
            System.out.println((char) (++n + 96) + " : " + i);
        }
    }
}