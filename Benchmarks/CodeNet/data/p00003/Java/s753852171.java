import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.System;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] a){
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(r.readLine());
            StringTokenizer st;

            int length[] = new length[3];
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(r.readLine());
                for(int j = 0; j < 3; j++)  length[j] = Integer.parseInt(st.nextToken());

                Arrays.sort(side);
                if((length[0]*length[0] + length[1]*length[1]) == length[2]*length[2]) System.out.println("YES");
                 else System.out.println("NO");
            }
        } catch (Exception ex) {System.exit(0)}
    }
}