import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        while(true) {
            sum = 0;
            String line = br.readLine();
            if(line.length()==1)
                if(Integer.parseInt(line)==0)break;
            for(int i=0;i<line.length();i++){
                sum += Integer.parseInt(String.valueOf(line.charAt(i)));
            }
            System.out.println(sum);
        }
    }
}