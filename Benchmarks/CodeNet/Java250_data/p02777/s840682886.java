import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] str = new String[2];
        str = br.readLine().split(" ");
        
        String[] strNum = new String[2];
        strNum = br.readLine().split(" ");
        int[] num = new int[2];
        num[0] = Integer.parseInt(strNum[0]);
        num[1] = Integer.parseInt(strNum[1]);
        
        String which = br.readLine();
        
        out.println(str[0].equals(which) ? (num[0] - 1) + " " + num[1] : num[0] + " " + (num[1] - 1));
        out.close();
        
    }
}