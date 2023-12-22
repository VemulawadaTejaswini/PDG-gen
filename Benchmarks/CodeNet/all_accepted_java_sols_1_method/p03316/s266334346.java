//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_n = br.readLine();
        int n = Integer.parseInt(str_n);
        int digit_sum = 0;
        
        for (int i = 0; i < str_n.length(); i++) {
            digit_sum += Integer.parseInt(String.valueOf(str_n.charAt(i)));
        }
        
        System.out.println(n%digit_sum==0?"Yes":"No");
    }
}
