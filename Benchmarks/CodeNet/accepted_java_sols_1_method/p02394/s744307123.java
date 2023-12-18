import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     String[] abc = str.split(" ", 0);
     int W = Integer.parseInt(abc[0]);
     int H = Integer.parseInt(abc[1]);
     int x = Integer.parseInt(abc[2]);
     int y = Integer.parseInt(abc[3]);
     int r = Integer.parseInt(abc[4]);
     

     if(r<=H-y){
    	 if (r<=y){
    		 if(r<=W-x){
    			 if(r<=x){
    				 System.out.println("Yes");
    			 }
    			 else{
    	    		 System.out.println("No");}
    		 }
    		 else{
        		 System.out.println("No");}
         }
    	 else{
    		 System.out.println("No");}
    	 }
    	 else{
    		 System.out.println("No");}
    
 }
}