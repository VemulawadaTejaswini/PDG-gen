import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i = 0; i < b; i++){
            sb1.append(a);
        }
        
        for(int i = 0; i < a; i++){
            sb2.append(b);
        }
        
        out.println(sb1.compareTo(sb2) > 0 ? sb2 : sb1);
        out.close();
        
    }
}