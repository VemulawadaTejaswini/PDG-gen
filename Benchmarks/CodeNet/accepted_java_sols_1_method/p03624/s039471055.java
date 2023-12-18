import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
        String s = br.readLine();
        boolean[] used = new boolean[26];

        for (int i = 0; i < s.length(); i++) used[s.charAt(i) - 'a'] = true;

        for (int i = 0; i < 26; i++){
            if(!used[i]){
                System.out.println((char)(i + 'a'));
                return;
            }
        }

        System.out.println("None");
    }
}
