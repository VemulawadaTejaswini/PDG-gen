import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mochis = Integer.parseInt(br.readLine());
        Set<Integer> mochi = new HashSet<Integer>();

        for(int i = 0; i<mochis; i++){
            mochi.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(mochi.size());
    }    
}