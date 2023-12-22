import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ans = "";
        for(int i=0; i<3; i++) {
            String s = br.readLine().trim();
            ans += s.charAt(i);
        }
        System.out.println(ans);
    }
}