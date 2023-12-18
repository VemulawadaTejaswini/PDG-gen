import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] a)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] b = new int[10];
        int i = 0;
        for(; i<b.length; i++){
            String s = br.readLine();
            b[i] = Integer.parseInt(s);
        }
        Arrays.sort(b);
        for(int d=9; d>6; d--){
            System.out.println(b[d]);
        }
        
    }
}