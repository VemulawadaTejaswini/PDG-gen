import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String temp[] = br.readLine().split(" ");
        
        long n = Long.parseLong(temp[0]);
        double y = Double.parseDouble(temp[1]);

        double temp2 = y*(double)(n);



        System.out.println((long)temp2);
       

    }
}