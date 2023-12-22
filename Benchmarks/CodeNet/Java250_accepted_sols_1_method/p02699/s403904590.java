import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
       String isSafe = "";
    
       int [] a = new int [2];
     
       
       String  lines = br.readLine();    
    
       String[] strs = lines.trim().split("\\s+");
      
       for (int i = 0; i < strs.length; i++) {
       a[i] = Integer.parseInt(strs[i]);
       }

       if(a[1]>=a[0]){
           isSafe = "unsafe";
       }
       else{
           isSafe = "safe";
       }
       System.out.println(isSafe);
    }catch (Exception e) {
    }
    
}}