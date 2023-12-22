import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argst)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        double n = Double.parseDouble(str);

        double sq = n * n * Math.PI;
        String ans1 = String.format("%.5f",sq);

        double len = n * 2 * Math.PI;
        String ans2 = String.format("%.5f",len);

        System.out.println(ans1 + " " + ans2);


    }
}