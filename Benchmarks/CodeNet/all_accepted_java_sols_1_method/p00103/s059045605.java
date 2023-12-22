import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            int base = 0;
            int out = 0;
            int point = 0;
 
            while (out < 3) {
                String str = br.readLine();
 
                switch (str) {
                case "HIT":
                    point += base & 1;
                    base = (base | 8) >> 1;
             
                    break;
                case "HOMERUN":
                    point += Integer.bitCount(base)+1;
                    base = 0;
                     
                    break;
                case "OUT":
                    out++;
                    break;
                }
            }
             
            System.out.println(point);
        }
 
    }
}