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
        if ( n.length == 3 ) {
            int n1 = Math.min(n[0], n[1]);
            int n2 = Math.max(n[0], n[1]);
            int n3 = Math.min(n1, n[2]);
            int n4 = Math.max(n2, n[2]);
            int n5 = 0;
            for (int i = 0; i < n.length; i++) {
                if(n[i] != n3 && n[i] != n4) {
                    n5 = n[i];
                }
            }

            System.out.println(n3 + " " + n5 + " " + n4);
        }
    }
}