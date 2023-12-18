import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int fa = 0;
    	int fb = 0;
    	int time = 1;
    	Scanner scan = new Scanner(System.in);
    	fa = scan.nextInt();
    	fb = scan.nextInt();
    	int sum = fa + fb;
    	int div = 10;
    	double check = 0;
    	 while(true){
    		 check =  sum/div;
    		 if(check < 1){
    			 break;	
    		 }
    		 div = div * 10;
    		 time = time + 1;
    	}
    	 System.out.println(time);
    	
    }
 }