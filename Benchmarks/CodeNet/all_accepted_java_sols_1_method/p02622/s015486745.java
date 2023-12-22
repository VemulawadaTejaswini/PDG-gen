import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        String T = br.readLine();
        int ans=0;

        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i)!=T.charAt(i)) {
                ans++;
            }
        }
        System.out.println(ans);

    }

}