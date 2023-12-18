import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] abk = br.readLine().split(" ");
        int a = Integer.parseInt(abk[0]);
        int b = Integer.parseInt(abk[1]);
        int k = Integer.parseInt(abk[2]);
        
        if(k*2 > (b-a)){
            for(int i = a; i <= b; i++)
            System.out.println(i);
        }
        else{
            for(int i = a; i < a+k; i++)
            System.out.println(i);
            for(int i = b-k+1; i <= b; i++)
            System.out.println(i);
        }
    }

}
