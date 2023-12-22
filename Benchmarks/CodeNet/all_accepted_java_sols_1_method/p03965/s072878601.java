import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] == 'p') {
                    score--;
                }
            } else {
                if (arr[i] == 'g') {
                    score++;
                }
            }
        }
        System.out.println(score);
    }
}