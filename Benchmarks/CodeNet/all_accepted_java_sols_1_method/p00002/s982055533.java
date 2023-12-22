import java.util.*;
import java.io.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try{
            while(null != (line = br.readLine()))
            {
                String[] strArr = line.split(" ");
                System.out.println((int)Math.log10(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]))+1);
            }
        }
        catch(Exception e){
        }
    }
}