import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
       String isWin = "";
    
       int [] a = new int [4];
     
       
       String  lines = br.readLine();    
    
       String[] strs = lines.trim().split("\\s+");
      
       for (int i = 0; i < strs.length; i++) {
       a[i] = Integer.parseInt(strs[i]);
       }
  
    int taka = (a[0]+a[3]-1)/a[3];
    int aoki = (a[2]+a[1]-1)/a[1];
    
    
    System.out.println(taka>=aoki?"Yes" : "No" ); 
     
    }catch (Exception e) {
    }
    
}}