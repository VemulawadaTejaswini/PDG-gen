import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        double sq = (double)n * (double)n * Math.PI;
        String ans1 = String.format("%.5f",sq);

        double len = (double)n * 2 * Math.PI;
        String ans2 = String.format("%.5f",len);

        System.out.println(ans1 + " " + ans2);


    }
}