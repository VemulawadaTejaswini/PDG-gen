import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fst[] = in.readLine().split(" ");
        String[] At = in.readLine().split(" ");
        String[] Bt = in.readLine().split(" ");
        int maxA = Integer.parseInt(fst[2]);
        int minB = Integer.parseInt(fst[3]);
        for (int index = 0; index < At.length; index ++) {
            maxA = Math.max(maxA, Integer.parseInt(At[index]));
        }
        for (int index = 0; index < Bt.length; index ++) {
            minB = Math.min(minB, Integer.parseInt(Bt[index]));
        }
        if(maxA == minB || maxA > minB){
            System.out.println("War");
        }else{
            System.out.println("No War"); 
        }
    }
}