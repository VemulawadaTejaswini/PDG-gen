import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String[] str = br.readLine().split(" ");
            int[] ary = new int[str.length];
            for(int i = 0; i < ary.length; i++) {
                ary[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(ary);
            for(int i = 0; i < ary.length; i++) {
                if(i > 0) {
                    System.out.print(" ");
                }
                System.out.print(ary[i]);
            }
            System.out.println();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}