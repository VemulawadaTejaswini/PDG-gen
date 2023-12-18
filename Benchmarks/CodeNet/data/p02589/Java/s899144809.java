import java.io.*;

import static java.lang.Integer.*;

public class Main {

    static int getPair(String[] s,int n){
        int count = 1;
        char c = s[0].charAt(0);
        for (int i = 1; i < n; i++){
            if (c == s[i].charAt(0)){
                count++;
            }
        }
        return n - count;
    }



    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(read.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++){
            s[i] = read.readLine();
        }
        prnt.println(getPair(s,n));
        prnt.close();
    }
}