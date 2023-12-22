import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String S = br.readLine();
        String T = br.readLine();

        String[] T_array = T.split("");

        int ans = T.length();

        for(int i = 0; i < S.length() - T.length() + 1; i++) {
            String str = S.substring(i, i + T.length());
            String[] str_array = str.split("");

            int tmp = 0;

            for(int j = 0; j < str_array.length; j++) {
                if(!str_array[j].equals(T_array[j])) {
                    tmp += 1;
                }
            }

            if(ans > tmp) ans = tmp;
        }

        pw.println(ans);
        br.close();
        pw.close();
    }
}