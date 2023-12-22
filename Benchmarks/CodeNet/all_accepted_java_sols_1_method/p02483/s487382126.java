import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] st;
 
        st = in.readLine().split(" ");
        int[] Box = new int[3];
        for(int i = 0;i < Box.length; ++i){
            Box[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(Box);
        System.out.println("" + Box[0] + " " + Box[1] + " " + Box[2]);
    }
}