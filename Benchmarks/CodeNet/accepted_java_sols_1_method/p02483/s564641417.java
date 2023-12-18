import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] ia;

        ia = in.readLine().split(" ");
        int[] tmp = new int[3];
        for(int i = 0;i < tmp.length; ++i){
            tmp[i] = Integer.parseInt(ia[i]);
        }
        Arrays.sort(tmp);
        System.out.println("" + tmp[0] + " " + tmp[1] + " " + tmp[2]);
    }
}