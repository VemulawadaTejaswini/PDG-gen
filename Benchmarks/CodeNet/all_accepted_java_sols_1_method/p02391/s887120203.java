import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] s = str.split(" ");
        int[] n = new int[s.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(s[i]);
        }
        if ( n.length == 2 ) {
            if ( n[0] > n[1]){
                System.out.println("a > b");
            } else if ( n[0] == n[1] ) {
                System.out.println("a == b");
            } else if ( n[0] < n[1] ) {
                System.out.println("a < b");
            }
        }
    }
}